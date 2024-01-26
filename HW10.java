import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
class HW10{
    public static void main(String[] args){
        try{

            //-----Exercise 1-----

            BufferedReader reader=new BufferedReader(new FileReader("matrixinput.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("matrixoutput.txt"));
            int n=Integer.parseInt(reader.readLine());
            int[][] a=new int[10][10];
            for(int i=0;i<n;i++){
                String[] nostring=reader.readLine().split("\\s+");
                for(int j=0;j<n;j++)
                    a[i][j]=Integer.parseInt(nostring[j]);
            }
            for(int i=0;i<n-1;i++)
                for(int j=0;j<n-i-1;j++){
                    int aux=a[i][j];
                    a[i][j]=a[n-j-1][n-i-1];
                    a[n-j-1][n-i-1]=aux;
                }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                    writer.write(a[i][j]+" ");
                writer.write('\n');
            }

            //-----Exercise 2-----

            reader=new BufferedReader(new FileReader("zip.txt"));
            String line;
            int k=0;
            while((line=reader.readLine())!=null){
                StringTokenizer tokens=new StringTokenizer(line,",");
                if(tokens.countTokens()==10){
                    k++;
                }
            }
            System.out.println(k);
            Town[] towns=new Town[k];
            int i=0;
            reader=new BufferedReader(new FileReader("zip.txt"));
            while((line=reader.readLine())!=null){
                StringTokenizer tokens=new StringTokenizer(line,",");
                while(tokens.hasMoreTokens()){
                    String zipCode=tokens.nextToken().trim();
                    String townName=tokens.nextToken().trim();
                    String state=tokens.nextToken().trim();
                    String phoneAreaCode=tokens.nextToken().trim();
                    tokens.nextToken();
                    String county=tokens.nextToken().trim();
                    String timeZone=tokens.nextToken().trim();
                    tokens.nextToken();
                    tokens.nextToken();
                    int countyPopulation=Integer.parseInt(tokens.nextToken().trim());
                    Town town=new Town(zipCode,townName,state,phoneAreaCode,county,timeZone,countyPopulation);
                    towns[i]=town;
                    i++;
                }
            }
            Scanner scan=new Scanner(System.in);
            String town=scan.nextLine();
            String state=scan.nextLine();
            boolean found=false;
            for(i=0;i<k;i++){
                if(towns[i].getTownName().equalsIgnoreCase(town) && towns[i].getState().equalsIgnoreCase(state)){
                    System.out.println(towns[i].getTownName()+", "+towns[i].getState()+" Found...");
                    System.out.println(towns[i].toString());
                    found=true;
                    break;
                }
            }
            if(!found) System.out.println("town not found");

            reader.close();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class Town{
    private String zipCode;
    private String townName;
    private String state;
    private String phoneAreaCode;
    private String county;
    private String timeZone;
    private int countyPopulation;
    public Town(String zipCode, String townName, String state, String phoneAreaCode, String county, String timeZone, int countyPopulation){
        this.zipCode=zipCode;
        this.townName=townName;
        this.state=state;
        this.phoneAreaCode=phoneAreaCode;
        this.county=county;
        this.timeZone=timeZone;
        this.countyPopulation=countyPopulation;
    }
    public String getZipCode(){
        return zipCode;
    }
    public String getTownName(){
        return townName;
    }
    public String getState(){
        return state;
    }
    public String getPhoneAreaCode(){
        return phoneAreaCode;
    }
    public String getCounty(){
        return county;
    }
    public String getTimeZone(){
        return timeZone;
    }
    public int getCountyPopulation(){
        return countyPopulation;
    }
    public String toString(){
        return "Town: "+townName+", "+state+", "+zipCode+" (Phone Area Code: "+phoneAreaCode+", Time Zone: "+timeZone+") County: "+county+", Population: "+countyPopulation;
    }
}