package ArrayBasic;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7};
        int num = 66;
        int target = 2;
        //2와 3 사이에 66을 넣고싶다!!

        //1. 사이즈가 1개 큰 배열을 생성
        int[] arr2 = new int[arr.length+1];

        //2. 기존 배열을 새 배열에 복사
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }

        System.out.println(Arrays.toString(arr2));
        //3. 삽입 위치에서 데이터를 한칸씩 이동
        for (int i =0;i<arr2.length;i++){
            if (i>2){
                arr2[i]=arr[i-1];
            }
            else {
                continue;
            }
        }

        //4. 새로운 데이터를 타겟 인덱스에 할당
        arr2[2]=num;
        System.out.println(Arrays.toString(arr2));

        //5. 주소값 이전(arr2는 더이상 새 배열에 관여하면 안됨)
        arr=arr2; arr2=null;
        System.out.println(Arrays.toString(arr));
    }



}
