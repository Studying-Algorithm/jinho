import java.util.Scanner;

public class bj1924 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int d = in.nextInt();
        int[] Month = {31, 28, 31, 30, 31, 30,
                       31, 31, 30, 31, 30, 31};
        String[] Date = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int sum = 0;
        for (int i = 0; i < m - 1; i++) { /* 배열은 0부터 시작하기 때문에 -1을 넣어주었다. */
            sum += Month[i];
        }
        /* 달을 계산할 때 지난 달까지 합쳐서 받아야 함으로 sum에 받아주었다. */
        sum += d - 1;/* -1은 1월 1일 월요일을 기준으로 시작하였기에 원래는 일요일부터이지만 요일을 맞춰주기 위해 넣었다.  */
        /* sum에 담겨있는 값에서 추가로 선택한 일의 날짜를 더해주었다. */
        System.out.println(Date[sum % 7]);
        /* sum을 7로 나누고 남은 나머지를 Date 배열의 순서와 대조하여 결과를 도출했다.  */
    }
}