import java.io.*;
import java.util.StringTokenizer;
abstract class Insurance{
    static int nextID=1;
    private int id;
    private int number;
    private String firstName;
    private String lastName;
    private String address;
    double amountPerperiod;
    String frequency;
    private double sum;
    public Insurance(String firstName, String lastName, String address){
        this.id=nextID++;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.amountPerperiod=13;
        this.frequency="montly";
        this.sum=0;
    }
    public Insurance(String firstName, String lastName, String address, String frequency){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.frequency=frequency;
    }
    abstract void computeAmountPerPeriod();
    public void computeSum(){
        sum=sum+amountPerperiod;
    }
    public double getSum(){
        return sum;
    }
    public String getFrequency(){
        return frequency;
    }
    public String toString(){
        return id+" "+firstName+" "+lastName+" "+address+" "+sum+" "+amountPerperiod+" "+frequency;
    }
}
class LifeInsurance extends Insurance{
    public LifeInsurance(String firstName, String lastName, String address){
        super(firstName,lastName,address);
    }
    public void computeAmountPerPeriod(){
        //if(frequency.equals("quarterly"));
            amountPerperiod=amountPerperiod*1.02;
    }
}
class AccidentInsurance extends Insurance{
    public AccidentInsurance(String firstName, String lastName, String address){
        super(firstName,lastName,address);
    }
    public void computeAmountPerPeriod(){
        //if(frequency.equals("half-yearly"));
            amountPerperiod=amountPerperiod*1.05;
    }
}



abstract class HardwareProduct{
    protected double currencyPrice;
    protected double priceLei;
    protected double score;
    protected double performance;
    public HardwareProduct(double currencyPrice, double score){
        this.currencyPrice=currencyPrice;
        this.score=score;
    }
    abstract void computePerformance();
    public double computeRatioLeiPricePerformance(){
        return priceLei/performance;
    }
    public String toString(){
        return priceLei+" "+score+" "+performance;
    }
}
class VideoCard extends HardwareProduct{
    private int maximunScore=100;
    public VideoCard(double currencyPrice, double score){
        super(currencyPrice,score);
    }
    public void computePriceInLei(){
        priceLei=currencyPrice*4.9;
    }
    public void computePerformance(){
        performance=score/maximunScore*100;
    }
}
class Monitor extends HardwareProduct{
    private int maximunScore=150;
    public Monitor(double currencyPrice, double score){
        super(currencyPrice,score);
    }
    public void computePriceInLei(){
        priceLei=currencyPrice*5;
    }
    public void computePerformance(){
        performance=score/maximunScore*100;
    }
}



class Lab13{
    public static void main(String[] args){
        Insurance lifeInsurance=new LifeInsurance("John", "Smith", "Block Avenue");
        lifeInsurance.computeAmountPerPeriod();
        lifeInsurance.computeSum();
        System.out.println(lifeInsurance);
        Insurance accidentInsurance=new AccidentInsurance("Jack", "Oliver", "Hood Avenue");
        accidentInsurance.computeAmountPerPeriod();
        accidentInsurance.computeSum();
        System.out.println(accidentInsurance);



        try{
            BufferedReader reader=new BufferedReader(new FileReader("placivideo.txt"));
            String line;
            int k=0;
            while((line=reader.readLine())!=null){
                k++;
            }
            reader=new BufferedReader(new FileReader("monitoare.txt"));
            while((line=reader.readLine())!=null){
                k++;
            }
            HardwareProduct[] products=new HardwareProduct[k];
            int i=0;
            reader=new BufferedReader(new FileReader("placivideo.txt"));
            while((line=reader.readLine())!=null){
                StringTokenizer tokens=new StringTokenizer(line," ");
                while(tokens.hasMoreTokens()){
                    double currencyPrice=Double.parseDouble(tokens.nextToken().trim());
                    double score=Double.parseDouble(tokens.nextToken().trim());
                    VideoCard product=new VideoCard(currencyPrice,score);
                    product.computePriceInLei();
                    product.computePerformance();
                    products[i]=product;
                    i++;
                }
            }
            reader=new BufferedReader(new FileReader("monitoare.txt"));
            while((line=reader.readLine())!=null){
                StringTokenizer tokens=new StringTokenizer(line," ");
                while(tokens.hasMoreTokens()){
                    double currencyPrice=Double.parseDouble(tokens.nextToken().trim());
                    double score=Double.parseDouble(tokens.nextToken().trim());
                    Monitor product=new Monitor(currencyPrice,score);
                    product.computePriceInLei();
                    product.computePerformance();
                    products[i]=product;
                    i++;
                }
            }
            for(i=0;i<k;i++)
                System.out.println(products[i].toString());
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}