import java.util.Scanner;
public class BJ1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            for(int j = 2; j <= a[i]; j++) {
                if(j == a[i]){
                    sum++;
                }
                if (a[i] % j == 0) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}