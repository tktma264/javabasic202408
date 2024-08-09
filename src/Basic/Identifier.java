package Basic;

public class Identifier {
    public static void main(String[] args) {
        //1. 식별자는 대소문자 철저하게 구분됨
        int age=35;
        int Age=40;
        System.out.println("age = "+age);
        System.out.println("Age = "+Age);

        //2. 식별자는 숫자로만 이루어지거나 숫자로 시작하면 안됨
        //int 12=34;(X)
        //7number=7;(X)
        int number7=7;
        int num7ber=7;

        //3. 식별자에 공백을 넣을 수 없음
        //int my score=90;(X)
        int my_score=90;
        int myScore=90;//주로 사용

        //4. 식별자에 특수기호는 _, $만 가능(
        //사용을 권장하지 않음

        //5. 키워드{예약어}는 식별자로 사용할 수 없음
        //int int=1;(X)
        int Int=1;//추천하지 않음

        //6. 한글이나 한자도 식별자로 문법적으로 허용하지만 권장하지 않음
        int 숫자=1;
    }
}
