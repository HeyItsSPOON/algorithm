import java.util.Scanner;

public class SearchMultiple{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        int i = 0;
        int count = 0;

        for(; i<N ; i++){
            if(count == K) break;

            if(N%(i+1)==0) count++;
            else continue;
        }

        if (count < K) System.out.print(0);
        else System.out.print(i);
    }
}