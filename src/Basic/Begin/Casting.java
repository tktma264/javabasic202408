package Basic.Begin;

public class Casting {
    public static void main(String[] args) {
        byte b=10;
        int i=b;
        System.out.println(i);

        char c = '가';
        int j=c;
        System.out.println(j);

        int d = 100;
        double q = d;
        System.out.println(q);

        //double v=100;
        //int k = v;
        //안됨

        double v = 3.141592;
        int k =(int)v;
        System.out.println(k);

        int u = 2000000000;
        char t = (char) u;
        System.out.println(t);

        int h = 1000;
        byte m = (byte)h;
        System.out.println(m);


        char gf = 'b';
        int aq = 10 ;
        int result = gf+aq;
        System.out.println(result);
        //서로 다른 타입간의 연산은 작은쪽이 큰쪽을 따라감

        int k1=10;
        double d1=(double)k1/4;
        System.out.println(d1);
        //int와 int의 연산은 int이므로 double로 형병환하여야함
    }
}
