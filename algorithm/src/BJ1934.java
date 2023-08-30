import java.util.Scanner;

public class BJ1934 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int d = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            d = a * b;
            int c;
            while (b != 0) {
                c = a % b;
                a = b;
                b = c;
            }
            System.out.println(d/a);
        }
    }
}
