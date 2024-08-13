package Package;
//continue에서 for문은 증감식 발동하나 while은 증감식 발동안함
public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i<10; i++){
            if (i==5) continue;
                System.out.println("i = " + i);


        }
        System.out.println("반복문 종료");
    }
}
