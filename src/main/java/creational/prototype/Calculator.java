package creational.prototype;

public class Calculator
{
    public static void main(String[] args){
        System.out.println(add(124, 241));
        System.out.println(sub(245, 800));
        System.out.println(mul(20, 45));
        System.out.println(div(85, 7));
        System.out.println(84/7);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }
    public static double div(int a, int b){
        if(b==0){
            throw new IllegalArgumentException();
        }
        return (double)a/(double) b;
    }

}
