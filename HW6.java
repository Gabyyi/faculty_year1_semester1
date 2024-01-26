import java.lang.Math;
class AddOperations{
    public int addition(int a, int b){
        int sum=a+b;
        return sum;
    }
    public double addition(double a, double b){
        double sum=a+b;
        return sum;
    }
    public String addition(String a, String b){
        String sum=a+b;
        return sum;
    }
}


class Cube{
    private int length;
    public Cube(int length){
        this.length=length;
    }
    public int getLength(){
        return length;
    }
}
class Sphere{
    private double radius;
    public Sphere(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
}
class Cone{
    private double length;
    private double radius;
    public Cone(double length, double radius){
        this.length=length;
        this.radius=radius;
    }
    public double getLength(){
        return length;
    }
    public double getRadius(){
        return radius;
    }
}
class GeomtricBox{
    private Cube cube;
    private Sphere sphere;
    private Cone cone;
    public GeomtricBox(int lengthCube, double radiusSphere, double lengthCone, double radiusCone){
        this.cube=new Cube(lengthCube);
        this.sphere=new Sphere(radiusSphere);
        this.cone=new Cone(lengthCone,radiusCone);
    }
    public int calculateVolume(Cube cube){
        int volume=cube.getLength()*cube.getLength()*cube.getLength();
        return volume;
    }
    public double calculateVolume(Sphere sphere){
        double volume=4/3*Math.PI*sphere.getRadius()*sphere.getRadius()*sphere.getRadius();
        return volume;
    }
    public double calculateVolume(Cone cone){
        double volume=Math.PI*cone.getRadius()*cone.getRadius()*cone.getLength();
        return volume;
    }

}

class HW6{
    public static void main(String[] args){
        //-----Exercise 1-----
        System.out.println("Exercise 1:\n");
        AddOperations add=new AddOperations();
        System.out.println(add.addition(2,5));
        System.out.println(add.addition(2.3,5.2));
        System.out.println(add.addition("abc","def"));

        //-----Exercise 2-----
        System.out.println("\nExercise 2:\n");
        Cube cube=new Cube(5);
        Sphere sphere=new Sphere(5);
        Cone cone=new Cone(10,5);
        GeomtricBox gb=new GeomtricBox(5,5,10,5);
        System.out.println(gb.calculateVolume(cube));
        System.out.println(gb.calculateVolume(sphere));
        System.out.println(gb.calculateVolume(cone));
    }
}