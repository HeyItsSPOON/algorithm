import java.util.Scanner;
public class Snail {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int A = number.nextInt();
        int B = number.nextInt();
        int V = number.nextInt();

        // 마지막날 밤에 미끄러지는 거리를 제외한 달팽이가 나무를 오른 거리 구하기
        double dayDouble = (V-B)/(A-B);
        // 날짜는 소수가 없으므로 올림
        int day = (int)Math.ceil(dayDouble);

        // 미끄러지기 전에 이미 나무 정상에 도달했는지 확인
        if ((A-B)*day+B >= V) {
            System.out.print(day);
        }
        else {
            System.out.print(day+1);
        }
    }
}
