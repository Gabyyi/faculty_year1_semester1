public class BinarySearch{
    int binarySearch(int v[], int x){    
        int l=0,r=v.length-1,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if(v[m]==x) return m;
            if(v[m]<x) l=m+1;
            else r=m-1;
        }
        return -1;
    }
    public static void main(String[] args){
        BinarySearch ob = new BinarySearch();
        int[] v={2,5,8,12,16,23,38,56,72,91};
        int x=23;
        int result=ob.binarySearch(v,x);
        if(result==-1) System.out.println("The element "+x+" is not present in the array");
        else System.out.print("The element was found at index "+result);
    }
}
