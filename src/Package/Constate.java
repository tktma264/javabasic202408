package Package;

import java.util.Scanner;

public class Constate {
    public static void main(String[] args) {
        double random = Math.random();
        random= random*100;

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();

        System.out.println("score = " + score);
        System.out.println("평점 = " +random);
        if (score>=90) {
            System.out.println("본인: 합격");
        }
        
        else{
            System.out.println("불합격");
        }






    }
}
