import java.util.Scanner;
public class Matrix{
    public static void main(String[] args){
        int[][] a=new int[100][100];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++)
            for(int j=0;j<7;j++)
                a[i][j]=scan.nextInt();
        System.out.println();
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++)
                System.out.print((a[i][j])+" ");
            System.out.println();
        }
        int max=a[0][0];
        for(int i=0;i<5;i++)
            for(int j=0;j<7;j++)
                if(a[i][j]>max) max=a[i][j];
        System.out.println("The max value for the entire matrix is "+max);
        for(int i=0;i<5;i++){
            max=a[i][0];
            for(int j=1;j<7;j++)
                if(a[i][j]>max) max=a[i][j];
            System.out.println("The max element on row "+i+" is "+max);
        }

    }
}


