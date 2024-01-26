import java.lang.Math;
import java.util.Scanner;

public class SecondHW{
    
    //-----Exercise 1-----

    public static void SecondLab1(){
        double result=0;
        result=((1.0/2+(3.0/17)*(5.0/2)+Math.sqrt(1.0/2))/(2.0/Math.pow(7,3)))*((9.0/2+3.0/4)/(1.0/Math.pow(3,3)));
        System.out.println(result);
    }

    //-----Exercise 2-----

    public static void SecondLab2(){
        Scanner scan=new Scanner(System.in);
        System.out.print("FirstName= ");
        String FirstName=scan.nextLine();
        System.out.print("LastName= ");
        String LastName=scan.nextLine();
        System.out.print("CNP= ");
        int CNP=scan.nextInt();
        String password,substring1,substring2;
        substring1=FirstName.substring(0,2);
        substring1=substring1.toLowerCase();
        substring2=LastName.substring(LastName.length()-2);
        substring2=substring2.toUpperCase();
        password=substring1+substring2;
        System.out.println(password);
    }

    //-----Exercise 3-----

    public static void Exercise3(){
        int n1=0,m=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("n=");
        int n=scan.nextInt();
        n1=n;
        while(n1!=0)
        {
            m=m*10+n1%10;
            n1/=10;
        }
        if(n==m) System.out.println("The number "+n+" is a palindrome");
        else System.out.println("The number "+n+" is not a palindrome");
    }

    //-----Exercise 4-----

    public static void Exercise4(){
        for(int i=0;i<4;i++){
            for(int j=0;j<10;j++)
                System.out.print('*');
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++)
                System.out.print('*');
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++)
                System.out.print(' ');
            for(int k=0;k<i+1;k++)
                System.out.print('*');
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++)
                System.out.print(' ');
            for(int k=0;k<i+1;k++)
                System.out.print('*');
            for(int l=0;l<i;l++)
                System.out.print('*');
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++)
                System.out.print(' ');
            for(int k=0;k<i+1;k++)
                System.out.print(i+1);
            for(int l=0;l<i;l++)
                System.out.print(i+1);
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++)
                System.out.print(' ');
            int x=i+1;
            for(int k=0;k<i+1;k++)
                System.out.print(x--);
            int y=2;
            for(int l=0;l<i;l++)
                System.out.print(y++);
            System.out.println();
        }
    }

    //-----Exercise 5-----

    public static void Exercise5(){
        int[][] a=new int[100][100];
        Scanner scan=new Scanner(System.in);
        System.out.print("n=");
        int n=scan.nextInt();
        System.out.print("m=");
        int m=scan.nextInt();
        System.out.println("Read the matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=scan.nextInt();
        int s=0;
        for(int i=0;i<n;i++){
            s=0;
            for(int j=0;j<m;j++)
                s=s+a[i][j];
            System.out.println("The row-wise sum for row "+(i+1)+" is "+s);
        }
        for(int j=0;j<m;j++){
            s=0;
            for(int i=0;i<n;i++)
                s=s+a[i][j];
            System.out.println("The column-wise sum for row "+(j+1)+" is "+s);
        }
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++)
                System.out.print((a[i][j])+" ");
            System.out.println();
        }
    }

    public static void main (String[] args){
        System.out.println("Exercise 1:");
        SecondLab1();
        System.out.println("\nExercise 2:");
        SecondLab2();
        System.out.println("\nExercise 3:");
        Exercise3();
        System.out.println("\nExercise 4:");
        Exercise4();
        System.out.println("\nExercise 5:");
        Exercise5();
    }
}