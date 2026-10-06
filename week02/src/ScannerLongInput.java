import java.util.Scanner;

public class ScannerLongInput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        long x;

        System.out.println("Enter the value of x: ");
        x=sc.nextLong();

        System.out.println("x = "+x);

        sc.close();
    }
}