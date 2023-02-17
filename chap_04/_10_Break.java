package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        //break

        //치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        int max = 20;
        for (int i = 1; i <= 50; i++){

            System.out.println(i+"번째 닭 판매 완료");
            max -= 1;
            if (max == 0){
                break;
            }
        }

    }
}
