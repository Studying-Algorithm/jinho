import java.util.Scanner;

public class BJ1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //반복 횟수
        int a, b, c;

        for(int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = 1;

            for(int j = 0; j < b; j++){
                c = (c * a) % 10;
                if (c == 0)
                    c = 10;
            }
            System.out.println(c);
        }
    }
}
