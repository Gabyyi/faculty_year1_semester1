import java.util.Scanner;
import java.util.List;
public class JavaHW4{
    
    //-----Exercise 1-----

    //In Java we can't modify the characters of a string using '=' operator, so we need to create a new string in which we add the modifications
    /*
        String s1="I am working on HW4 at the moment";
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)=='4') s1.charAt(i)='5';      => compilation erron
        System.out.println(s1);
    */

    public static void Exercise1(){
        String s1="I am working on HW4 at the moment";
        String s2=new String();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='4') s2=s2+'5';
            else s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
    

    //-----Exercise 2-----

    public static void Exercise2(){
        int[] v = {1,2,3,4};
        printArray(v);              //output: 1 2 3 4
        test(v);                    //replaces 1 with 0
        printArray(v);              //output: 0 2 3 4
    }
    static void test(int[] s){
        s[0]=0;                        //this will replace the fist element of array v with 0 when the test() function is called
    }
    static void printArray(int[] array){
        for(int i=0;i<array.length;i++)
        System.out.print(array[i]+" ");
        System.out.println();
    }


    //-----Exercise 3-----

    public static void password(String p){
        boolean validCharacters=false;
        boolean invalidDigits=true;
        boolean invalidLetters=true;
        for(int i=0;i<p.length();i++){
            if((Character.compare('0',p.charAt(i))<=0 && Character.compare(p.charAt(i),'9')<=0) ||
               (Character.compare('a',p.charAt(i))<=0 && Character.compare(p.charAt(i),'z')<=0) ||
               (Character.compare('A',p.charAt(i))<=0 && Character.compare(p.charAt(i),'Z')<=0))
                validCharacters=true;
            else{
                validCharacters=false;
                break;
            }
        }
        for(int i=0;i<p.length();i++){
            if(Character.compare('0',p.charAt(i))<=0 && Character.compare(p.charAt(i),'9')<=0) invalidDigits=true;
            else{
                invalidDigits=false;
                break;
            }
        }
        for(int i=0;i<p.length();i++){
            if((Character.compare('a',p.charAt(i))<=0 && Character.compare(p.charAt(i),'z')<=0) ||
               (Character.compare('A',p.charAt(i))<=0 && Character.compare(p.charAt(i),'Z')<=0)) invalidLetters=true;
            else{
                invalidLetters=false;
                break;
            }
        }
        if(p.length()<8 && !validCharacters) System.out.println("Invalid Password: Password must have at least 8 charactes and contain only letters and digits");
        else if(p.length()<8) System.out.println("Invalid Password: Password must have at least 8 characters");
        else if(!validCharacters) System.out.println("Invalid Password: Password must contain only letters and digits");
        else if(invalidDigits) System.out.println("Invalid Password: Password must contain at least one letter");
        else if(invalidLetters) System.out.println("Invalid Password: Password must contain at least one digit");
        else System.out.println("Valid Password");
    }

    public static void Exercise3(){
        Scanner scan=new Scanner(System.in);
        String p=scan.nextLine();
        password(p);
    }


    //-----Exercise 4-----

    public static int pointsInside(int[][] pointCoords, int[][] zoneCoords){
        int k=0;
        int x1=zoneCoords[0][0];
        int y1=zoneCoords[0][1];
        int x2=zoneCoords[1][0];
        int y2=zoneCoords[1][1];
        int x3=zoneCoords[2][0];
        int y3=zoneCoords[2][1];
        int x4=zoneCoords[3][0];
        int y4=zoneCoords[3][1];
        boolean found=false;
        for(int i=0;i<pointCoords.length;i++){
            int x=pointCoords[i][0];
            int y=pointCoords[i][1];
            found=false;
            if(((y1<=y && y<y2) || (y2<=y && y<y1)) && x<(x2-x1)*(y-y1)/(y2-y1)+x1){
                found=!found;
            }
            if(((y2<=y && y<y3) || (y3<=y && y<y2)) && x<(x3-x2)*(y-y2)/(y3-y2)+x2){
                found=!found;
            }
            if(((y3<=y && y<y4) || (y4<=y && y<y3)) && x<(x4-x3)*(y-y3)/(y4-y3)+x3){
                found=!found;
            }
            if(((y4<=y && y<y1) || (y1<=y && y<y4)) && x<(x1-x4)*(y-y4)/(y1-y4)+x4){
                found=!found;
            }
            if(found) k++;
        }
        return k;
    }

    public static void Exercise4(){
        int[][] pointCoords={{1,2},{12,35},{56,-2},{3,12},{1,1},{23,-1}};
        int[][] zoneCoords={{2,1},{4,-5},{-4,6},{5,5}};
        System.out.println(pointsInside(pointCoords,zoneCoords));
    }

    public static void main(String[] args){
        System.out.println("Exercise 1");
        Exercise1();
        System.out.println("Exercise 2");
        Exercise2();
        System.out.println("Exercise 3");
        Exercise3();
        System.out.println("Exercise 4");
        Exercise4();
    }
}