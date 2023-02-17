package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 앞에 () 안에 넣어주기
        // ex) (int) 39.4
        // int -> long -> float -> double (자동 형변환)

        //숫자를 문자열로
        String s1 = String.valueOf(30);
        s1 = Integer.toString(30);
        System.out.println(s1);

        String s2 = String.valueOf(30.4);
        s2 = Double.toString(30.4);
        System.out.println(s2);

        //문자를 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double k = Double.parseDouble("39.2");
        System.out.println(k);
    }
}
