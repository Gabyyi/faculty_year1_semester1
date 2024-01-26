public class LongestPositiveSequence{
    public static void main(String[] args){
        int[] a={1,2,-3,2,3,4,-6,8,2,3,5,1,-8,6};
        int i=0,l=0,lmax=-1,k=0;
        while(i<14){
            if(a[i]>=0) l++;
            else{
                if(l>lmax) {lmax=l;l=0;k=i;}
                else l=0;
            }
            i++;
        }
        if(lmax!=0)System.out.print("Index: "+(k-lmax)+", length: "+lmax);
        else System.out.print("No positive sequence found");
        }
}