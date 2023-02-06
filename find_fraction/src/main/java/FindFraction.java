import java.util.Scanner;

public class FindFraction {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        boolean direction = true;
        int row = 1;
        int column = 1;


        for (int n = 1; n < num; n++) {
            // 오른쪽 방향으로 가는 경우
            if (direction) {
                row -= 1;
                column += 1;

                // 맨 윗줄이 되면 방향 전환
                if (row == 0) {
                    direction = !direction;
                    row = 1;
                }

                // 맨 왼쪽줄이 되면 방향 전환 ( 없어도 됨 )
                else if (column == 0) {
                    direction = !direction;
                    column = 1;
                }
            }
            // 왼쪽 방향으로 가는 경우
            else {
                row += 1;
                column -= 1;

                // 맨 윗줄이 되면 방향 전환 ( 없어도 됨 )
                if (row == 0) {
                    direction = !direction;
                    row = 1;
                }

                // 맨 왼쪽줄이 되면 방향 전환
                else if (column == 0) {
                    direction = !direction;
                    column = 1;
                }
            }
        }

        System.out.print(row);
        System.out.print('/');
        System.out.print(column);
    }
}
