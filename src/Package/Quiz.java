package Package;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean p = true;
        int sum = 0;
        while (p) {
            System.out.println("숫자 1을 입력하세요");
            int num1 = sc1.nextInt();
            System.out.println("숫자 2를 입력하세요");
            int num2 = sc2.nextInt();
            if (num1>num2){
                for (int j = num2;j<=num1;j++) {
                    sum = sum + j;
                }
                System.out.println(num2 + "부터 " + num1 + "까지의 합: " + sum);
                p = false;
            }
            else {
                for (int i = num1;i<=num2;i++){
                    sum = sum+i;
                    p=false;
                }
                System.out.println(num1+"부터 "+num2+"까지의 합: "+sum);
                p=false;
            break;
            }
        }



    }
}
