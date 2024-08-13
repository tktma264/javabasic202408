package StandardPrint;
//1. Scanner API를 로딩

import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {

        //2.Scanner 객체를 생성 
        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        
        //3.Scanner의 함수를 이용하여 데이터 입력받기
        //next():공백없는 문자열
        //nextLine():공백있는 문자열
        //nextInt():정수데이터 입력
        //nextDouble(): 실수데이터 입력

        System.out.println("이름을 입력하세요");
        String name=input.next();
        System.out.println("name = " + name);

        System.out.println("나이를 입력하세요");
        int year=input2.nextInt();
        System.out.println("year = " + year);

        //4. 닫기
        input.close();
        input2.close();

        
    }
}
