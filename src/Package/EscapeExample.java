package Package;

import java.util.Scanner;

public class EscapeExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count =0;
        double correct = 0;

        while (true){
            double num1 = Math.random();
            double num2 = Math.random();
            double num3 = Math.random();
            int pro1 = (int) (num1*100)+1;
            int pro2 = (int) (num2*100)+1;
            if (num3>0.5) {
                System.out.println(pro1 + "+" + pro2 + "의 답은?");
                System.out.println("정답을 입력하세요");
                int input = sc.nextInt();
                if (input == pro1 + pro2) {
                    System.out.println("정답입니다");
                    correct += 1;
                    count += 1;
                } else if (input == 0) {
                    System.out.println("종료되었습니다.");
                    System.out.println("정답 횟수: " + (int) correct);
                    System.out.println("시도 횟수: " + count);
                    System.out.printf("정답률: %.2f%%", correct / count * 100);
                    break;
                } else if (input != pro1 + pro2) {
                    System.out.println("오답입니다");
                    count += 1;
                }
            }
            else {
                System.out.println(pro1 + "-" + pro2 + "의 답은?");
                System.out.println("정답을 입력하세요");
                int input = sc.nextInt();
                if (input == pro1 - pro2) {
                    System.out.println("정답입니다");
                    correct += 1;
                    count += 1;
                } else if (input == 0) {
                    System.out.println("종료되었습니다.");
                    System.out.println("정답 횟수: " + (int) correct);
                    System.out.println("시도 횟수: " + count);
                    System.out.printf("정답률: %.2f%%", correct / count * 100);
                    break;
                } else if (input != pro1 - pro2) {
                    System.out.println("오답입니다");
                    count += 1;
                }
            }
        }
    }
}
