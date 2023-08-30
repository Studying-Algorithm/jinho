import java.util.Scanner;
public class BJ2921 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = 3;
        int b = 6;
        int m = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            m = a;
            sum += m;
            a += b;
            b += 3;
        }
        System.out.println(sum);
    }
}
