import java.util.Scanner;

public class VerticalReading{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i=0; i<5; i++) {
            String tmp = in.nextLine();
            for(int j = 0; j<tmp.length(); j++) {
                arr[i][j] = tmp.charAt(j);
            }
        }

        for (int j=0; j<15; j++){
            for (int i=0; i<5; i++) {
                if (arr[i][j] != Character.MIN_VALUE) System.out.print(arr[i][j]);
            }
        }
    }
}