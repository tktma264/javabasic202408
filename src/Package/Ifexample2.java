package Package;

import java.util.Scanner;

public class Ifexample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();

        if (age<=13 && age>=8) {
            System.out.println("초등학생입니다.");

        }
        else if (age<=16 && age>=14) {
            System.out.println("중학생입니다.");
        }
        else if (age<=19 && age>=17) {
            System.out.println("고등학생입니다.");
        }
        else if (age>=20){
            if (age<40){
                System.out.println("청년입니다.");
            }
            else if (age<65){
                System.out.println("중년층입니다.");
            }
            else {
                System.out.println("노년층입니다.");
            }
        }
        else {
            System.out.println("미취학아동입니다.");
        }
    }

}
