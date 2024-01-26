import java.lang.Math;
import java.util.Scanner;
public class JavaHW3{
    
    //-----Exercise 1-----

    public static double distance(double x1, double y1, double x2, double y2){
        double d=0;
        d=Math.abs(x1-x2)+Math.abs(y1-y2);
        return d;
    }

    //-----Exercise 2-----
    /*
2 4 3 5 6
1 2 5 8 8
6 3 7 8 4
9 0 2 5 3
1 2 3 4 5   */

    public static void Matrix(){
        int[][] a=new int[100][100];
        int n=5,s=0;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=scan.nextInt();
        for(int i=0;i<n;i++)
            s=s+a[i][n-i-1];
        System.out.println("The sum of all the values of the secondary diagonal is "+s);
        s=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                s=s+a[i][j];
        System.out.println("The sum of all the values above the primary diagonal is "+s);
        s=0;
        for(int i=1;i<n;i++)
            for(int j=n-i;j<n;j++)
                s=s+a[i][j];
        System.out.println("The sum of all the values under the secondary diagonal is "+s);
    }

    //-----Exercise 3-----

    public static void Reverse(){
        int[] a={4,5,1,2};
        int aux=0,n=a.length;
        for(int i=0;i<n/2;i++){
            aux=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=aux;

        }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }

    //-----Exercise 4-----

    public static void Frequency(){
        int[] A=new int[100];
        int[] frq=new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.print("n=");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            A[i]=scan.nextInt();
            frq[A[i]]++;
        }
        boolean found=false;
        for(int i=0;i<10;i++)
            if(frq[i]>n/2) {System.out.println(i);found=true;}
        if(found==false) System.out.println("No majority element");
    }

    //-----Exercise 5-----

    public static void Spiralmatrix(){
        int[][] a={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {10,11,12,13,14},
            {14,15,16,17,18},
            {19,20,21,22,23}
        };
        int top=0,bottom=a.length,left=0,right=a[0].length;
        while(top<=bottom && left<=right){
            for(int j=left;j<right;j++)
                System.out.print(a[top][j]+" ");
            top++;
            for(int i=top;i<bottom;i++)
                System.out.print(a[i][right-1]+" ");
            right--;
            for(int j=right-1;j>=left;j--)
                System.out.print(a[bottom-1][j]+" ");
            bottom--;
            for(int i=bottom-1;i>=top;i--)
                System.out.print(a[i][left]+" ");
            left++;
        }
    }   

    public static void main(String[] args){
        System.out.println("Exercise 1");
        double x1=0,y1=0,x2=4,y2=5;
        distance(x1,y1,x2,y2);{
            System.out.print("The distance between the points A("+x1+","+y1+") and B("+x2+","+y2+") is ");
            System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2));
        }
        System.out.println("Exercise 2");
        Matrix();
        System.out.println("Exercise 3");
        Reverse();
        System.out.println("Exercise 4");
        Frequency();
        System.out.println("Exercise 5");
        Spiralmatrix();
    }
}
