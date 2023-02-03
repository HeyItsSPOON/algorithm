import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        int startNum = 1;

        while (number > startNum) {
            startNum += 6*count; // 6의 배수만큼 벌집이 증가
            count++; // 지나쳐온 벌집껍질의 개수
        }
        System.out.println(count);
    }
}
