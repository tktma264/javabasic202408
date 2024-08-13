package Package;

public class WhileExample {
    public static void main(String[] args) {
        //48부터 150사이 정수 중

        int num=6;

        while (true){
            int num8=num*8;
            if (num8>=150){
                break;

            }
            System.out.print(num8+" ");
            num+=1;


        }

        int j=1;
        int count =0;
        while (j<=1001){
            if (1000%j==0){
                count=count+1;
                j=j+1;
            }
            j=j+1;
        }
        System.out.println("\n1000의 약수: "+count+ "개");

        int n=1;
        int con=0;
        while (true){
            int num2=258*n;
            if (num2<=3000){
                con=con+1;
                n=n+1;
            }
            else if (num2>3000) {
                break;
            }
        }
        System.out.println("3000이하: "+ con);
    }
}
