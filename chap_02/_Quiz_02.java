package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int tall_1 = 115;
        int tall_2 = 121;

        String x = (tall_1 >= 120) ? "가능합니다" : "불가능합니다";
        String y = (tall_2 >= 120) ? "가능합니다" : "불가능합니다";

        System.out.println("키가 "+tall_1+"cm 이므로 탑승 "+x);
        System.out.println("키가 "+tall_2+"cm 이므로 탑승 "+y);
    }
}
