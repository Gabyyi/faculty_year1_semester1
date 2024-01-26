public class Lab5{
    
    //-----Exercise 1-----

    public static boolean isPrime(int n){
        boolean prime=true;
        if(n<2) {prime=false;return prime;}
        if(n==2) {prime=true;return prime;}
        if(n%2==0) {prime=false;return prime;}
        for(int i=2;i<=n/2;i++)
            if(n%i==0) {prime=false;break;}
        return prime;
    }

    public static void genPrimes(int n){
        for(int i=2;i<n;i++)
            if(isPrime(i)) System.out.print(i+" ");
    }

    public static boolean allPrimeDivisors(int n){
        boolean div=true;
        for(int i=2;i<=n/2;i++)
            if(n*i==0)
                if(!isPrime(i)) {div=false;return div;}
        return div;
    }

    public static void Exercise1(){
        int n=6;
        if(isPrime(n)) System.out.println(n+" is prime");
        else System.out.println(n+" is not prime");
        genPrimes(n);
        if(allPrimeDivisors(n)) System.out.println("\nAll divisors are prime numbers");
        else System.out.println("\nNot all divisors are prime numbers");
    }


    //-----Exercise 2-----

    public static boolean isPerfect(int n){
        int s=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0) s+=i;
        if(s==n) return true;
        else return false;
    }
    public static void Exercise2(){
        int n=15;
        for(int i=2;i<n;i++)
            if(isPerfect(i)) System.out.print(i+" ");
    }

    //-----Exerecise 3-----

    public static int match(String s1, String s2){
        int lastIndex=0,k=0;
        while(lastIndex!=-1){
            lastIndex=s2.indexOf(s1,lastIndex);
            if(lastIndex!=-1){
                k++;
                lastIndex+=s1.length();
            }
        }
        return k;
    }
    public static void Exercise3(){
        String s1="str",s2="string1 and string2 gives string3";
        System.out.println(match(s1,s2));
    }

    //-----Exercise 4-----

    public static int countChars(String s, char c){
        int k=0;
        for(int i=0;i<s.length();i++)
            if(c==s.charAt(i)) k++;
        return k;
    }
    public static int countCharsRecursive(String s, char c, int i){
        int k=0;
        if(i>=s.length()) return 0;
        if(c==s.charAt(i)) k=1;
        return k+countCharsRecursive(s,c,i+1);
    }
    public static void Exercise4(){
        String s="This is a string";
        char c='i';
        System.out.println(countChars(s,c));
        int i=0;
        System.out.println(countCharsRecursive(s,c,i));
    }

    //-----Exercise 5-----
    
    public static void modify(String s){
        String s1=new String();
        for(int i=0;i<s.length()/2;i++){
            s1=s1+s.charAt(i)+s.charAt(s.length()-1-i);
        }
        for(int i=0;i<s1.length();i++)
            System.out.print(s1.charAt(i));
    }
    public static void Exercise5(){
        String s="Hi there";
        modify(s);
    }
    public static void main(String[] args){
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
    }
}