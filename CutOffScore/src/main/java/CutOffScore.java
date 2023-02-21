import java.util.Scanner;

public class CutOffScore{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int k = in.nextInt();

        int students[] = new int[N];

        for (int i=0; i<students.length; i++) {
            int score = in.nextInt();
            students[i] = score;
        }

        for (int i=1; i<students.length; i++) {
            for (int j=i-1; j>=0; j--) {
                if(students[j] > students[j+1]) {
                    int tmp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = tmp;
                }
                else break;
            }
        }
        System.out.print(students[N-k]);
    }
}