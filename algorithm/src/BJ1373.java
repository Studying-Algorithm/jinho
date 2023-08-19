import java.util.Scanner;
public class BJ1373 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int size = a.length();
        if(size%3==1)
            a = "00" + a;
        if(size%3==2)
            a = "0" + a;

        StringBuilder b = new StringBuilder();

        int q = 0;
        int w = 0;
        int e;

        for (int i = 0; i <= a.length()-1; i++){
            int num = a.charAt(i)-'0';
            if(i%3==0) q = num*4;
            else if(i%3==1) w = num*2;
            else {
                e = num;
                b.append(q+w+e);
            }
        }
        System.out.println(b);
    }
}