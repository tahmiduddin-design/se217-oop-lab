public class DivisorsFunction{
    public static void main(String[] args){
        divisors(15);
    }

    static void divisors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}