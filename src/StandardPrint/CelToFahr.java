package StandardPrint;

import java.util.Scanner;


public class CelToFahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도를 입력해보세요!");
        double tem=sc.nextDouble();
        tem= ((tem * 9) / 5) + 32;
        System.out.println("현재 온도는 화씨 " +tem+ "입니다.");


    }
}
