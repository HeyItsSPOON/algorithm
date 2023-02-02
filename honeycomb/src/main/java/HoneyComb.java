import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int startNum = 1;

        while (true) {
            (startNum + (6 * count) <= number)? count++:break;
        }
            if (startNum + (6 * count) <= number) {
                count++;
            else
        }
    }
}
