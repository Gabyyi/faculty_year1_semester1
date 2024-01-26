class Car{
    static int o=0;
    private double startOdo;
    private double endOdo;
    private double litersUsed;
    public Car(double startOdo, double endOdo, double litersUsed){
        this.startOdo=startOdo;
        this.endOdo=endOdo;
        this.litersUsed=litersUsed;
        o++;
    }
    public double computeConsumtion(){
        double distance=this.endOdo-this.startOdo;
        double consumtion=100*this.litersUsed/distance;
        return consumtion;
    }
}

class Fleet{
    private Car town;
    private Car suv;
    public Fleet(double Car1StartOdo, double Car1EndOdo, double Car1Liters, double Car2StartOdo, double Car2EndOdo, double Car2Liters){
        this.town=new Car(Car1StartOdo, Car1EndOdo, Car1Liters);
        this.suv=new Car(Car2StartOdo, Car2EndOdo, Car2Liters);
    }
    public double computeAvgConsumtion(){
        double avgconsumtion=(town.computeConsumtion()+suv.computeConsumtion())/2;
        return avgconsumtion;
    }
}


class Account{
    private String accountNumber; 
    private String accountHolder; 
    private double balance;
    public Account(String accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void processDeposit(double amount){
        balance+=amount;
        System.out.println(balance);
    }
    public void processCheck(double amount){
        if(balance<10000)
            balance=balance-amount-15;
        else balance=balance-amount;
        System.out.println(balance);
    }

}

public class Lab6{  
        public static void main(String[] args){
        Car car1=new Car(115, 130, 10);
        Car car2=new Car(2345, 3500, 120);
        System.out.println("The first car had a fuel consumtion of "+car1.computeConsumtion()+" l/100km");
        System.out.println("The second car had a fuel consumtion of "+car2.computeConsumtion()+ " l/100km");
        Fleet fleet=new Fleet(124, 4432, 321, 323, 432, 120);
        System.out.println("The two cars had an average fuel consumtion of "+fleet.computeAvgConsumtion()+" l/100km");

        Account account1=new Account("0001A","John Gabriel",0);
        System.out.println(account1.getBalance());
        account1.processDeposit(10000);
        account1.processCheck(300);
    }
}