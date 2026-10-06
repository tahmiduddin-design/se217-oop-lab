import java.util.Scanner;

public class CalculatorFunction{
    public static void main(String[] args){
        int x,y;

        System.out.println("Please enter the value of x and y:");

        Scanner sc=new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();

        sc.close();

        int r=add(x,y);

        System.out.println("Output: "+r);
    }

    static int add(int x,int y){
        int result=x+y;
        return result;
    }

    static int subtract(int x,int y){
        int result=x-y;
        return result;
    }

    static int multiply(int x,int y){
        int result=x*y;
        return result;
    }

    static int divide(int x,int y){
        int result=x/y;
        return result;
    }
}