package ArrayBasic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        //배열에서 원하는 위치의 데이터 값 삭제하기
        int[] arr={2,3,7,8,10,11,14};
        int target = 3;
        int[] arr2 = new int[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            if (i>target){

                arr2[i-1]=arr[i];
            }
            else {
                arr2[i] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr2));




    }
}
