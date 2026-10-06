import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the value of x and y:");

        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Addition: "+add(x,y));
        System.out.println("Subtraction: "+subtract(x,y));
        System.out.println("Multiplication: "+multiply(x,y));
        System.out.println("Division: "+divide(x,y));

        sc.close();
    }

    static int add(int x,int y){
        return x+y;
    }

    static int subtract(int x,int y){
        return x-y;
    }

    static int multiply(int x,int y){
        return x*y;
    }

    static int divide(int x,int y){
        return x/y;
    }
}