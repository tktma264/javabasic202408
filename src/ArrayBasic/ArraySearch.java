package ArrayBasic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        String[] str = {"밥", "김치", "물", "된장국"};
        System.out.println(Arrays.toString(str));
        Scanner sc = new Scanner(System.in);
        System.out.println("음식명을 입력하세요");
        String input = sc.next();

        boolean flag = true;

        for (int i = 0; i < str.length; i++) {
            if (input.equals(str[i])) {
                int j = i + 1;
                System.out.println("음식은 " + j + "번에 있습니다.");
                flag = false;
                break;

            }
        }

        while (flag){
            System.out.println("없어요");
            break;
        }




    }
}