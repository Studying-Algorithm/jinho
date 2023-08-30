import java.util.Scanner;

public class BJ2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        while(true) {
            if(N % 5 == 0) {
                System.out.println(N / 5 + sum);
                break;
            } else if (N < 0){
                System.out.println(-1);
                break;
            }
            N = N - 3;
            sum++;
        }
    }
}
