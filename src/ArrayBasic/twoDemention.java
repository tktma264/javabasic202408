package ArrayBasic;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class twoDemention {
    public static void main(String[] args) {
        int[][] arr = {
                {79, 83, 74},
                {77, 69, 83},
                {91, 87, 94},
                {65, 72, 70}
        };


        String[] name = {"가", "나", "다", "라"};
        String[] subject = {"국어", "영어", "수학"};

        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.length);

        for (int i = 0; i < subject.length; i++) {
            double sum=0;
            for (int j = 0; j < name.length; j++) {
                sum = arr[j][i] + sum;
            }

            if (i==0){
                System.out.printf("국어: %.1f\n",(double)sum/ name.length);
            } else if (i == 1) {
                System.out.printf("수학: %.1f\n",(double)sum/ name.length);
            }
            else if (i == 2) {
                System.out.printf("영어: %.1f\n",(double)sum/ name.length);
            }

        }


        double suma = 0;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < subject.length; j++) {
                suma = suma+arr[i][j];
            }

        }
        int total = subject.length*name.length;
        System.out.printf("전체평균: %.1f",suma/total);
    }
}
