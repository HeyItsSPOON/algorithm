import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        arr1 = makeMetric(N,M);
        arr2 = makeMetric(N,M);

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] makeMetric(int n, int m) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int num = in.nextInt();
                arr[i][j] = num;
            }
        }

        return arr;
    }
}
