abstract class Animal{
    protected int legs;
    public Animal(int legs){
        this.legs=legs;
    }
    abstract void eat();
    public void walk(){
        System.out.println("This animal walk on "+legs+" legs");
    }
}
class Spider extends Animal{
    public Spider(){
        super(8);
    }
    public void eat(){
        System.out.println("The spider is eating bugs");
    }
}
interface Pet{
    public String getName();
    public void setName(String name);
    public void play();
}
class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
        this("");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println("The cat is playing");
    }
    public void eat(){
        System.out.println("The cat is eating the fish");
    }
}
class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
        super(0);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void play(){
        System.out.println("The fish is swimming");
    }
    public void walk(){
        System.out.println("The fish can't walk");
    }
    public void eat(){
        System.out.println("The fish is eating sand");
    }
}

class Lab10{
    public static void main(String[] args){
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();

        d.setName("Gold");
        System.out.println("The fish name is "+d.getName());
        d.play();
        d.walk();
        d.eat();

        System.out.println("\nThe cat name is "+c.getName());
        c.play();
        c.eat();
        c.walk();

        a.walk();
        a.eat();

        e.walk();
        e.eat();

        p.setName("Tom");
        System.out.println(p.getName()+" is the cat");
        p.play();
    }
}