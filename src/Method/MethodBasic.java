package Method;

public class MethodBasic {

    static int sum (int x){
        int total =0;
        for (int i = 0; i < x+1; i++) {
            total += i;
        }
        return total;
    }


    public static void main(String[] args) {
    int sum1 = sum(1090);
        System.out.println(sum1);
    }
}
