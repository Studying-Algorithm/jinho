import java.util.Scanner;

public class BJ1212 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        StringBuilder b = new StringBuilder();
//객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식을 사용하여 속도가 빠르다고 한다.
        for (int i = 0; i < a.length(); i++){ //입력된 값의 크기만큼 반복
            char c = a.charAt(i); //a의 i번째 글자에 차례에 순서대로 갑니다.
            switch (c) { // b.append(3 "011", 1 "001", 4 "100") 더해줌
                case '0': b.append("000"); break;
                case '1': b.append("001"); break;
                case '2': b.append("010"); break;
                case '3': b.append("011"); break;
                case '4': b.append("100"); break;
                case '5': b.append("101"); break;
                case '6': b.append("110"); break;
                case '7': b.append("111"); break;
                default: break;
            }
        }
        if (b.charAt(0)=='0') b.deleteCharAt(0);
        if (b.charAt(0)=='0') b.deleteCharAt(0);
        System.out.println(b);
    }
}
