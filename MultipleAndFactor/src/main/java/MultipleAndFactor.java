import java.util.Scanner;

public class MultipleAndFactor{
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);

        while(true){
            int a = in.nextInt();
            int b = in.nextInt();

            if (a == 0 && b == 0) break;

            if (a >= b) {
                if (a%b == 0) System.out.println("multiple");
                else System.out.println("neither");
            }
            else {
                if (b%a == 0) System.out.println("factor");
                else System.out.println("neither");
            }
        }
    }
}