package Package;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 단수를 입력하세요");
        int num = sc.nextInt();
        int i=1;
        System.out.println("***구구단 "+num+"단***");
        while (i<=9){
            int num1=num*i;
            System.out.println(num+"X"+i+"="+num1);
            i=i+1;
        }
    }
}


