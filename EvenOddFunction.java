public class EvenOddFunction{
    public static void main(String[] args){
        evenOrOdd(100);
    }

    static void evenOrOdd(int x){
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}