import java.util.Scanner;

public class ScannerDoubleInput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double x;

        System.out.println("Enter the value of x: ");
        x=sc.nextDouble();

        System.out.println("x = "+x);

        sc.close();
    }
}