public class IncrementOperator {

    public static void main(String[] args) {

        int x;

        x = 5;

        System.out.println("Current value of x is: " + x++);
        System.out.println("Current value of x is: " + ++x);

        x = 6;

        System.out.println("Current value of x is: " + ++x);
        System.out.println("Current value of x is: " + x++);

    }
}