import java.util.Scanner;

public class RepresentativeValue2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        for(int i=1; i<arr.length; i++) {
            for(int j=i-1; j>=0; j--) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                else break;
            }
        }
        System.out.println(sum/5);
        System.out.println(arr[2]);

    }
}