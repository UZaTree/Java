package chap_06;

public class _02_Parameter {
    public static void power(int number){
        int result = number * number;
        System.out.println(number + " μ 2μΉμ " + result);
    }

    public  static  void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        power(7);
        powerByExp(3,4);
    }
}
