package Package;

import java.util.Scanner;

public class LoopNesting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int n = sc.nextInt();

        String str = "";
        String sta = "";
        String star = "*";
        String blank = " ";
        for (int i = 1; i <= n; i++) {
            String bb = "";
            for (int j = n; j >= i; j--) {
                bb = blank + bb;
            }
            for (int k = 1;k<=i;k++){
                sta = sta+star;
            }
            str = bb + str + sta;
            System.out.println(str);
            str = "";
            sta = "";
        }


    }
}
