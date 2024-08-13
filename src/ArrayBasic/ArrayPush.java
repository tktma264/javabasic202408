package ArrayBasic;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        //push: 맨 끝에 데이터를 추가
        int[] num = {10,20,30,40};
        int newNum= 50;
        int[] arr = new int[num.length+1];

        for (int i = 0; i < num.length; i++) {
            arr[i]=num[i];
        }

        arr[arr.length-1]=newNum;

        num=arr; arr=null;
        System.out.println(Arrays.toString(num));





    }
}
