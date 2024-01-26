import java.util.Scanner;
public class Triplets{
    public static void main(String[] args){
        int[] a={1,6,3,0,8,4,1,7};
        Scanner scan=new Scanner(System.in);
        System.out.print("sum=");
        int s=scan.nextInt();
        int aux=0;
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                if(a[i]<a[j]) {aux=a[i];a[i]=a[j];a[j]=aux;}
        for(int i=0;i<6;i++)
            for(int j=i+1;j<7;j++)
                for(int k=j+1;k<8;k++)
                    if((a[i]+a[j]+a[k])==s){
                        System.out.print("("+a[i]+" "+a[j]+" "+a[k]+")");
                        System.out.println();
                    }
    }
}