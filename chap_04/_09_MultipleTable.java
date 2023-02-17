package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        for (int i =2; i <10; i++){
            System.out.println("구구단 "+i+" 단");
            for (int k =1; k <10; k++){
                System.out.println(i+" * "+k+" = "+i*k);
            }
        }
    }
}
