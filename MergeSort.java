import java.lang.Math;
public class MergeSort{
    public static void main(String[] args){
        int[] a={23,47,62,74},b={7,14,39,55,81,95};
        int[] c=new int[100];
        int i=0,j=0,k=0;
        while(i<4 && j<6){
            if(a[i]>b[j]) {c[k]=b[j];k++;j++;}
            else {c[k]=a[i];k++;i++;}
        }
        while(i<4){
            c[k]=a[i];k++;i++;
        }
        while(j<6){
            c[k]=b[j];k++;j++;
        }
        for(i=0;i<k;i++)
            System.out.print((c[i])+" ");
    }
}