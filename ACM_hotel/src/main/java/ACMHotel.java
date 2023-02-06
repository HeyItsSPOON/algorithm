import java.util.Scanner;
public class ACMHotel {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();	// 테스트 케이스


        for(int i = 0; i < T; i++) {

            int H = in.nextInt();
            int W = in.nextInt(); 	// 쓸모없는 변수다.
            int N = in.nextInt();

            // 나머지가 0인 경우는 맨 꼭대기 층이거나 1호실인 경우이므로 따로 연산하지 않는다.
            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));

            } else {
                // (N%H) * 100 : 층수
                // (N/H) + 1 : 엘리베이터에서 떨어진 거리
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
        }
    }
}
