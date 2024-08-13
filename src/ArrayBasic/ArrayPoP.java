package ArrayBasic;

import java.util.Arrays;

public class ArrayPoP {
    public static void main(String[] args) {
    //pop: 배열의 맨 끝 네이터를 삭제하면서 꺼내옴
    int[] arr = {3,4,7,9,17};
    int[] arr2 = new int[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            arr2[i]=arr[i];
        }

        //삭제값 백업
        int popnum=arr[arr.length-1];

        arr=arr2; arr2=null;

        System.out.println(Arrays.toString(arr));

    }
}
