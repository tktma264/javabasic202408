package StandardPrint;

public class Print {
    public static void main(String[] args) {
        //1. 개행을 포함하지 않는 print()
        //2. 개행을 포함하는 println()
        System.out.println("hi");
        System.out.println("hello");
        System.out.print("bye");
        System.out.println("see you again");

        //3. 형식지정표준출력함수 printf()
        //서식문자를 이용해서 문자열 완성
        //서식문자에 들어갈 값을 지정해서 출력하는 방식
        //줄 개행기능이 없음
        int month=12;
        int day=25;
        String anni="크리스마스";
        System.out.println(month+"월 "+day+"일은 "+anni+"입니다.");
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);

        double rate=64.5;
        System.out.printf("합격률은 %.2f%% 입니다.", rate);

    }
}
