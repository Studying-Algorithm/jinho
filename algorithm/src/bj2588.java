import java.util.Scanner;
public class bj2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int sum = 0;
        int dap = a * b;

        for(int i = 0; i < 3; i++) {
            sum = (b % 10) * a;
            System.out.println(sum);
            b /= 10;
        }
        System.out.println(dap);
    }
}
