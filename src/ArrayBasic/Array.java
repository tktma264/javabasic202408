package ArrayBasic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[4];
        arr[0]=34;
        arr[1]=12;
        arr[2]=203;
        arr[3]=322;


        System.out.println(arr.length);
        for (int i=0 ; i<arr.length;i++){
            System.out.println(i+" 번째 배열의 값: "+arr[i]);
        }
    //배열의 순회 foreach(향상된 for문)
        for (int i : arr) {

            System.out.println("i = " + i);


        }
        //배열 내부를 문자열 형태로 간결하게 출력
        System.out.println(Arrays.toString(arr));



        //배열 한번에 만들기
        int[] list = new int[]{90,80,95,85};
        System.out.println(Arrays.toString(list));


        //배열 변수 선언과 동시에 값을 초기화할때
        //한번만 가능한 문법

        String[] str ={"개","돼지","소","말"};
        //배열의 내용, 크기가 고정되어 있음

        //배열에 내용을 채워넣지 않았을 경우
        //기본값으로 채워짐
        byte[] bb = new byte[3];
        double[] dd = new double[3];
        boolean[] oo = new boolean[3];
        String[] ss = new String[3];
        System.out.println(Arrays.toString(bb));
        System.out.println(Arrays.toString(dd));
        System.out.println(Arrays.toString(oo));
        System.out.println(Arrays.toString(ss));
        


    }
}
