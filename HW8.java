import java.lang.Math;
abstract class Shape{
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color="red";
        this.filled=true;
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return color+" "+filled;
    }
}

class Circle extends Shape{
    private double radius=1;
    public Circle(){
        this.radius=radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        double area=Math.PI*Math.pow(radius,2);
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
    public String toString(){
        return "Circle[Shape[color="+color+", filled="+filled+"],radius="+radius+"]";
    }
}

class Rectangle extends Shape{
    private double width=1;
    private double length=1;
    public Rectangle(){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        double area=length*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*length+2*width;
        return perimeter;
    }
    public String toString(){
        return "Rectangle[Shape[color="+color+", filled="+filled+"],width="+width+", length="+length+"]";
    }
}

class Square extends Rectangle{
    private double side=1;
    public Square(){
        this.side=side;
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
        this.side=side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public double getArea(){
        double area=Math.pow(side,2);
        return area;
    }
    public double getPerimeter(){
        double perimeter=4*side;
        return perimeter;
    }
    public String toString(){
        return "Square[Shape[color="+color+", filled="+filled+"],side="+side+"]";
    }
}

class HW8{
    public static void main(String[] args){
        Circle circle1=new Circle();
        System.out.println(circle1.toString());
        Circle circle2=new Circle(10);
        circle2.setColor("yellow");
        System.out.println(circle2.toString());
        Circle circle3=new Circle(10,"blue",true);
        circle3.setRadius(20);
        System.out.println(circle3.toString());

        Rectangle rectangle1=new Rectangle();
        rectangle1.setColor("green");
        System.out.println(rectangle1.toString());
        Rectangle rectangle2=new Rectangle(15,20);
        rectangle2.setWidth(10);
        System.out.println(rectangle2.toString());
        Rectangle rectangle3=new Rectangle(15,20,"yellow",true);
        rectangle3.setFilled(false);
        System.out.println(rectangle3.toString());

        Square square1=new Square();
        System.out.println(square1.toString());
        Square square2=new Square(5);
        square2.setFilled(false);
        System.out.println(square2.toString());
        Square square3=new Square(5,"purple",true);
        square3.setSide(10);
        System.out.println(square3.toString());
    }
}
