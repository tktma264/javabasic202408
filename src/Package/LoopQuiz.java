package Package;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("자연수를 입력하세요");
        int num = sc.nextInt();
        int count = 0;
        int a=0;
        for (int j=1 ; j<=num;j++) {

            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {

                    count = count + 1;

                }
            }
            if (count == 2) {
                System.out.print(j);
                a=a+1;
            }
        }
        System.out.println("개수: "+a);
    }

}
