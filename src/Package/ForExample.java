package Package;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        int num=1;
        for (int i=1; i<=200;i=i+1){
            if (i%6==0&&i%12!=0){
                System.out.print(i+" ");
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\n숫자입력: ");
        int b=1;
        int j = sc.nextInt();
        for (int a=1;a<=j;a++){

            b=a*b;
        }
        System.out.println(b);



    }

}
