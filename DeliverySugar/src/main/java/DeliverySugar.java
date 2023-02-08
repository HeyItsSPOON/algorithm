import java.util.Scanner;
public class DeliverySugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int count = 0;

        if(weight%5 == 0) {
            count = weight/5;
        }
        else {
            if(weight%5%3==0) {
                count = weight/5+weight%5/3;
            }
            else {
                while (weight >= 0) {
                    System.out.println("weight before : " + weight);
                    System.out.println("count before : " + count);
                    weight -= 3;
                    count++;
                    if (weight%5==0) {
                        count += weight/5;
                        System.out.println("weight after : " + weight);
                        System.out.println("count after : " + count);
                        break;
                    }
                    else {
                        continue;
                    }
                }
                if (weight%5 != 0) {
                    if (weight%3 == 0) {
                        count = weight/3;
                    }
                    else {
                        count = -1;
                    }
                }
            }
        }
        System.out.print(count);
    }
}