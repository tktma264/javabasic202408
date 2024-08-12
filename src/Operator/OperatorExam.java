package Operator;

public class OperatorExam {
    public static void main(String[] args) {
        //난수값을 발생시키는 매서드 Math.random();
        //0.0이상 1.0이하 실수 난숫값 발생
        double random = Math.random();
        random*=10;
        System.out.println("random = " + random);
        double num=9.5;
        String str = random<num? "낙첨":"당첨";
        System.out.println(str);
        
        double ran2 = Math.random();
        ran2=90*ran2+10;
        System.out.println("ran2 = " + ran2);
    }
}
