package Package;

public class Loop {
    public static void main(String[] args) {
        int i=1;
        while (i<=100){
            System.out.println("안녕하세요 반갑습니다.");
            i+=10;
        }
        System.out.println("--------------------------------------------------------------------");
        int j=1;
        int num=0;
        while (j<=100){
            num=num+j;
            j=j+1;
            System.out.println("합계: "+num);
            System.out.println("=================================================================");

        }



    }
}
