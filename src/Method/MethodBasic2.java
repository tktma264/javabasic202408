package Method;


public class MethodBasic2 {

    static int sum(int x,int y){
        int total = 0;
        for (int i = x; i < y+1; i++) {
            total += i;
        }
        return total;
    }

    static String randomFood(){
        double ran = Math.random();
        if (ran>0.66){
            return "치킨";
        }
        else if (ran>0.33){
            return "족발";
        }
        else {
            return "피자";
        }
    }
    static double ave(int[] nums){
        int total=0;
        for (int num:nums){
            total += num;
        }
        return (double)total/nums.length;
    }
    //콤마로 나열되어 들어오는 여러개의 값은 배열로 인식
    static double ave2(int...nums){
        int total=0;
        for (int num:nums){
            total += num;
        }
        return (double)total/nums.length;
    }

    public static void main(String[] args) {
        int[] a={1,5,734,234,6,412,12,43,23,23,10};

        System.out.println(randomFood());
        System.out.println(ave(a));
        System.out.println(sum(27,50));
        System.out.println(ave2(1,543,6,76,654,324,23,243,45,354,21));
    }
}
