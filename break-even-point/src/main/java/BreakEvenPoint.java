import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixedCost = sc.nextInt();
        int variableCost = sc.nextInt();
        int price = sc.nextInt();

        // 이익이 발생하지 않을 때.
        if (variableCost >= price) {
            System.out.println(-1);
        } else {
            // 손익분기점을 계산하되, fixedCost / (price - variableCost)는 이익이 0이 되는 시점이므로 1을 더한다.
            System.out.println(fixedCost / (price - variableCost) + 1);
        }
    }
}