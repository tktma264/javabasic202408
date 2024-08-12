package Operator;

public class Quiz {
    public static void main(String[] args) {
        double ran1 = Math.random();
        ran1 = 42+355*ran1;
        int ran2 = (int) ran1;
        int i=1;
        String str = ran2%2==1?"홀수":"짝수";
        System.out.println("발생한 난수: "+ran2 );
        System.out.println("삼항 연산의 결과: "+str);

    }
}
