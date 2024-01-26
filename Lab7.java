class Rational{
    private int num;
    private int den;
    public Rational(){
        this.num=0;
        this.den=1;
    }
    private static int GCD(int a, int b){
        int aux=0;
        while(b!=0){
            aux=b;
            b=a%b;
            a=aux;
        }
        return a;
    }
    public Rational(int num, int den){
        int gcd=GCD(num, den);
        this.num=num/gcd;
        this.den=den/gcd;
    }
    public Rational add(Rational a, Rational b){
        int x=a.num*b.den+b.num*a.den;
        int y=a.den*b.den;
        return new Rational(x, y);
    }
    public Rational sub(Rational a, Rational b){
        int x=a.num*b.den-b.num*a.den;
        int y=a.den*b.den;
        return new Rational(x, y);
    }
    public Rational mult(Rational a,Rational b){
        int x=a.num*b.num;
        int y=a.den*b.den;
        return new Rational(x, y);
    }
    public Rational div(Rational a, Rational b){
        int x=a.num*b.den;
        int y=a.den*b.num;
        return new Rational(x, y);
    }
    public void intFormat(){
        System.out.println(num+"/"+den);
    }
    public void realFormat(){
        System.out.println((double)num/den);
    }
}


class Complex{
    private double re;
    private double im;
    public Complex(){
        this.re=0;
        this.im=0;
    }
    public Complex(double re, double im){
        this.re=re;
        this.im=im;
    }
    public Complex add(Complex a, Complex b){
        double x=a.re+b.re;
        double y=a.im+b.im;
        return new Complex(x, y);
    }
    public Complex sub(Complex a, Complex b){
        double x=a.re-b.re;
        double y=a.im-b.im;
        return new Complex(x, y);
    }
    public Complex mult(Complex a, Complex b){
        double x=a.re*b.re+a.im*b.im*(-1);
        double y=a.re*b.im+a.im*b.re;
        return new Complex(x ,y);
    }
    public Complex div(Complex a, Complex b){
        double x=a.re*b.re+a.im*b.im;
        double y=a.re*b.im*(-1)+a.im*b.re;
        double z=b.re*b.re+b.im*b.im;
        x=x/z;
        y=y/z;
        return new Complex(x, y);
    }
    public void tupleFormat(){
        if(im>=0) System.out.println(re+"+"+im+"*i");
        else System.out.println(re+""+im+"*i");
    }
}




class Lab7{
    public static void main(String[] args){
        Rational a=new Rational(2,3);
        Rational b=new Rational(4,5);
        Rational resultAdd=a.add(a,b);
        System.out.print("Int format for addition: ");
        resultAdd.intFormat();
        System.out.print("Real format for addition: ");
        resultAdd.realFormat();
        Rational resultSub=a.sub(a,b);
        System.out.print("Int format for subtraction: ");
        resultSub.intFormat();
        System.out.print("Real format for subtraction: ");
        resultSub.realFormat();
        Rational resultMult=a.mult(a,b);
        System.out.print("Int format for multiplication: ");
        resultMult.intFormat();
        System.out.print("Real format for multiplication: ");
        resultMult.realFormat();
        Rational resultDiv=a.div(a,b);
        System.out.print("Int format for division: ");
        resultDiv.intFormat();
        System.out.print("Real format for division: ");
        resultDiv.realFormat();



        Complex c=new Complex(2,3);
        Complex d=new Complex(4,5);
        Complex ResultAdd=c.add(c,d);
        System.out.print("Result for addition: ");
        ResultAdd.tupleFormat();
        Complex ResultSub=c.sub(c,d);
        System.out.print("Result for subtraction: ");
        ResultSub.tupleFormat();
        Complex ResultMult=c.mult(c,d);
        System.out.print("Result for multiplication: ");
        ResultMult.tupleFormat();
        Complex ResultDiv=c.div(c,d);
        System.out.print("Result for division: ");
        ResultDiv.tupleFormat();
    }
}