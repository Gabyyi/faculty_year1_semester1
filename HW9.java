interface Tossable{
    public void toss();
}
abstract class Ball implements Tossable{
    private String brandName;
    public Ball(String brandName){
        this.brandName=brandName;
    }
    public String getBrandName(){
        return brandName;
    }
    public void toss(){
        System.out.println("Toss the ball");
    }
    public void bounce(){
        System.out.println("The ball is bouncing");
    }
}
class Rock implements Tossable{
    public void toss(){
        System.out.println("Toss the rock");
    }
}
class Baseball extends Ball{
    public Baseball(String brandName){
        super(brandName);
    }
    public void toss(){
        System.out.println("Toss the ball");
    }
    public void bounce(){
        System.out.println("The ball is bouncing");
    }
}
class Football extends Ball{
    public Football(String brandName){
        super(brandName);
    }
    public void toss(){
        System.out.println("Toss the ball");
    }
    public void bounce(){
        System.out.println("The ball is bouncing");
    }
}

/*

1) How are abstract classes and interfaces the same?

Both interfaces and abstract classes are used to create classes. The two key similarities
between interfaces and abstract classes are that they both cannot be implemented, and both 
contain sets of methods that are defined and must be declared in their implementation.

2) How are abstract classes and interfaces different?

Abstract classes can have both concrete and abstract methods, can provide default implementations, and support inheritance.
Interfaces, on the other hand, can only have abstract methods, do not provide implementations, 
and support multiple inheritance through implementation.

3) Why does it generally make more sense to override the equals method than to overload it?

Why does it generally make more sense to override the equals method than to overload it? If equals is overridden, 
then you end up with two equals methods for the same class. Which one gets called will 
depend on the argument type. This usually isn't the intended behavior.

4) Which of the following will compile? Test in your code and explain the cause of the error.

Ball ball=new Football("spalding");             //will complile
Ball ball=new Football("Spalding");             //will not compile - variable ball is already defined
Baseball baseball=(Baseball)ball;               //will compile - it calls java.lang.ClassCastException at runtime
Object obj=new Baseball("spalding");            //will compile
Object obj=new Baseball("spalding");            //will not compile - variable obj is already defined
Tossable tossable=obj;                          //will not compile - Object cannot be converted to Tossable
Tossable tossable=new Baseball("spalding");     //will compile
Object obj=tossable;                            //will compile

*/

class HW9{
    public static void main(String[] args){
        Ball f=new Football("Kappa");
        System.out.println(f.getBrandName());
        f.toss();
        f.bounce();
    }
}