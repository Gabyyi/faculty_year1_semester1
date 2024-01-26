import java.util.Scanner;

public class FirstHW{

    public static void Exercise1(){
        int c=-4;
        boolean positive_flag=false;
        if(c>=0){
            positive_flag=true;
        }
        if(positive_flag==true){
            System.out.println("The variable c is a positive number");
        }

        //Mistake: In java the boolean values are not 0 and 1, they are true and false.
        //         Also we need to initialize the positive_flag variable with false at the beginning
    }

    public static void Exercise2(){
        double a,b,c;
        a=2.2;
        b=3.3;
        c=10;
        System.out.println(3/(1/a+1/b+1/c));
    }

    public static void Exercise3(){
        Scanner scan=new Scanner(System.in);
        System.out.print("a=");
        int a=scan.nextInt();
        System.out.print("b=");
        int b=scan.nextInt();
        System.out.print("c=");
        int c=scan.nextInt();
        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
            System.out.println("The triangle is right-angled");
            if(c==2*a || c==2*b || b==2*a || b==2*c || a==2*b ||a==2*c)
                System.out.println("It also has an angle equal to 30 degrees");
            else if(a==b || a==c || b==c)
                System.out.println("It also has two angles equal to 45 degrees");
        }
        else System.out.println("The triangle isn't right-angled");
    }

    public static void Exercise4(){
        Scanner scan=new Scanner(System.in);
        System.out.print("AmericanGrade=");
        char AmericanGrade=scan.next().charAt(0);
        switch(AmericanGrade){
            case 'A': {System.out.println("The equivalent of "+AmericanGrade+" grade in American System is 10 in European System");break;}
            case 'B': {System.out.println("The equivalent of "+AmericanGrade+" grade in American System is 8 in European System");break;}
            case 'C': {System.out.println("The equivalent of "+AmericanGrade+" grade in American System is 7 in European System");break;}
            case 'D': {System.out.println("The equivalent of "+AmericanGrade+" grade in American System is 6 in European System");break;}
            case 'F': {System.out.println("The equivalent of "+AmericanGrade+" grade in American System is 0 in European System");break;}
            default: break;
        }
    }

    public static void Exercise5(){
        String sport="I like to play basketball";
        String newsport=sport.replace("basketball","football");
        System.out.println("Original Message: "+sport);
        System.out.println("New Message: "+newsport);
    }

    public static void main (String[] args){
        System.out.println("Exercise 1:");
        Exercise1();
        System.out.println("\nExercise 2:");
        Exercise2();
        System.out.println("\nExercise 3:");
        Exercise3();
        System.out.println("\nExercise 4:");
        Exercise4();
        System.out.println("\nExercise 5:");
        Exercise5();
    }
}



