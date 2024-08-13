package Package;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println("성별을 입력해 주세요(남/여)");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        switch (input){

            case"남", "m", "M":
                System.out.println("남성입니다");
                break;

            case"여", "f", "F":
                System.out.println("여성입니다");
                break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;


        }
    }
}
