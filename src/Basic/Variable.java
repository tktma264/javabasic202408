package Basic;

public class Variable {
    public static void main(String[] args) {
        //변수 선언
        int age;
        //변수 초기화
        age=40;
        //변수 참조(사용)
        System.out.println("age = "+age);
        //변수는 참조와 동시에 사용하는 것이 일반적
        int score=95;
        //int score=90;(X) 변수명 중복선언 불가
        score=90;//데이터 타입이 안붙을 경우 기존 변수 참조
        //마지막 대입값이 사용
        System.out.println(score);

        int myscore=score-20;
        //변수에는 다른 변수의 값도 저장 가능
        System.out.println(myscore);

        //변수의 자료형에 맞지 않는 값은 저장불가
        //int count="한번";
        //String name=1;
        String name="홍길동";
        //변수는 자료형이 달라도 이름이 중복되면 허용 불가
        //int name=1004; (x)
        
        //int result=myscore+num;
        //num을 선언한 적이 없음
        
        
        //int result;
        //System.out.println("result = "+result);
        //변수는 초기화가 필요함
    }
    
}
