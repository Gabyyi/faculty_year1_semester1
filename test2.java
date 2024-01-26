import java.util.ArrayList;
import java.util.List;

//-----Exercise 1-----

abstract class Vehicle{
    protected String manufacturer;
    protected String model;
    public Vehicle(String manufacturer, String model){
        this.manufacturer=manufacturer;
        this.model=model;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public String toString(){
        return manufacturer+" "+model;
    }
}

interface InventoryManagement{
    public void addVehicle(Vehicle vehicle);
    public void removeVehicle(Vehicle vehicle);
}

class Car extends Vehicle{
    int num_doors;
    public Car(String manufacturer, String model, int num_doors){
        super(manufacturer,model);
        this.num_doors=num_doors;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public int getNumOfDoors(){
        return num_doors;
    }
    public String toString(){
        return manufacturer+" "+model+" "+num_doors;
    }
}

class Motorcycle extends Vehicle{
    private boolean has_sidecar;
    public Motorcycle(String manufacturer, String model, boolean has_sidecar){
        super(manufacturer,model);
        this.has_sidecar=has_sidecar;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public boolean getHasSidecar(){
        return has_sidecar;
    }
    public String toString(){
        return manufacturer+" "+model+" "+has_sidecar;
    }
}

class Truck extends Vehicle{
    private int payload_capacity;
    public Truck(String manufacturer, String model, int payload_capacity){
        super(manufacturer,model);
        this.payload_capacity=payload_capacity;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public int getPayloadCapacity(){
        return payload_capacity;
    }
    public String toString(){
        return manufacturer+" "+model+" "+payload_capacity;
    }
}

class ElectricCar extends Car{
    private int range;
    private int chargeTime;
    public ElectricCar(String manufacturer, String model, int num_doors, int range, int chargeTime) {
        super(manufacturer, model, num_doors);
        this.range=range;
        this.chargeTime=chargeTime;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public int getNumOfDoors(){
        return num_doors;
    }
    public int getChargeTime(){
        return chargeTime;
    }
    public String toString(){
        return manufacturer+" "+model+" "+num_doors+" "+chargeTime;
    }
}

class HybridCar extends Car{
    private int range;
    private int chargeTime;
    public HybridCar(String manufacturer, String model, int num_doors, int range, int chargeTime){
        super(manufacturer,model,num_doors);
        this.range=range;
        this.chargeTime=chargeTime;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public int getNumOfDoors(){
        return num_doors;
    }
    public int getChargeTime(){
        return chargeTime;
    }
    public String toString(){
        return manufacturer+" "+model+" "+num_doors+" "+chargeTime;
    }
}

class Dealership implements InventoryManagement{
    List<Vehicle> vehicles;
    public Dealership(){
        this.vehicles=new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println(vehicle.manufacturer+" "+vehicle.model+" has been just added to our Dealership.");
    }
    public void removeVehicle(Vehicle vehicle){
        if(vehicles.contains(vehicle)){
            vehicles.remove(vehicle);
            System.out.println("Successfully removed "+vehicle.manufacturer+" "+vehicle.model+" from our Dealership.");
        }
        else System.out.println("We are sorry, "+vehicle.manufacturer+" "+vehicle.model+" was not found in our parking lot.");
    }
}


//-----Exercise 2-----


abstract class Employee{
    protected String name;
    protected String ID;
    public Employee(String name, String ID) {
        this.name=name;
        this.ID=ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public String getName(){
        return name;
    }
    //public abstract String getStatus();
    //public abstract double calculateMonthlyPay();
    public String toString(){
        return name+" "+ID;
    }
}

class PartTimeEmp extends Employee{
    public double hourlyRate;
    public int hoursPerWeek;
    public PartTimeEmp(String name, String ID){
        super(name,ID);
    }
    public void setHours(int hours){
        this.hoursPerWeek=hours;
    }
    public void setRate(double rate){
        this.hourlyRate=rate;
    }
    public String toString(){
        return name+" "+ID+" "+hourlyRate+" "+hoursPerWeek;
    }
}

class FullTimeEmp extends Employee{
    double salary;
    public FullTimeEmp(String name, String ID){
        super(name,ID);
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String toString(){
        return "A full time employee gets "+salary+" euro per month";
    }
}


class test2{
    public static void main(String[] args){

        //-----Exercise 1-----

        Car car=new Car("BMW","5 series",4);
        Motorcycle motorcycle=new Motorcycle("Kawasaki","Ninja H2",true);
        Truck truck=new Truck("Dodge Ram","TRX",5000);
        ElectricCar electricCar=new ElectricCar("Tesla","Model 3",4,650,3);
        HybridCar hybridCar=new HybridCar("Toyota","Prius",4,50,25);
        
        Dealership dealership=new Dealership();
        dealership.addVehicle(car);
        dealership.addVehicle(motorcycle);
        dealership.addVehicle(truck);
        dealership.addVehicle(electricCar);
        dealership.addVehicle(hybridCar);
        
        dealership.removeVehicle(hybridCar);
        dealership.removeVehicle(motorcycle);

    
        //-----Exercise 2-----
        PartTimeEmp prt=new PartTimeEmp("John","1");
        prt.setHours(10);
        prt.setRate(5);
        System.out.println(prt.toString());

        FullTimeEmp ft=new FullTimeEmp("John","1");
        ft.setSalary(10000);
        System.out.println(ft.toString());
    }
}