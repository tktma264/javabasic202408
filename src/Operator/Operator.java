package Operator;

public class Operator {
    public static void main(String[] args) {
        
        //증감연산자: ++, --
        int i=1;
        int j =i++;
        int k=i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("------------------------------------------------------------------");
        
        int x = 1;
        int y = ++x;
        int z = --x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        
        int a = 5, b = 3;
        a+=3;
        double c= a;
        c/=3;
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        int m=10, n=30;
        System.out.println(x==y);


        System.out.println((x<8||y/0==10));
                
                
        int num1=10, num2=20;
        String str = num1>num2? "num1이 num2보다 큽니다":"num2가 num1보다 큽니다";
        System.out.println(str);

        //연산자 우선순위
        //괄호>참조>단항>이항>삼항>대입
        
    }
}
