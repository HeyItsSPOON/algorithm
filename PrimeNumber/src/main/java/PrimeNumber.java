import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int count = 0;
        boolean prime = false;

        for (int i=0; i<M; i++){
            int num = sc.nextInt();
            prime =isPrime(num);
            if (prime == true){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int number){
        if (number ==1) {
            return false;
        }
        for(int i=2; i<number; i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
