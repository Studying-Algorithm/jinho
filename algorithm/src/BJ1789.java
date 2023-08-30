import java.util.Scanner;

public class BJ1789 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        //자바 int는 21억정도까지 밖에 안됨
        //그러나 문제는 42억까지 요구함
        long sum = 0;
        int count = 0;
        for(int i = 1; ; i++) {
            if(sum > a) break;
            count++;
            sum += i;
        }
        System.out.println(count-1);
    }
}
