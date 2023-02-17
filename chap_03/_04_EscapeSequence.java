package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'

        System.out.println("자바가\n너무\n재미있어요.");

        System.out.println("해물파전\t9000원");
        System.out.println("부추전\t4000원");
        System.out.println("감자전\t7000원");

        System.out.println("C:\\Program Flies\\Java"); // \\: 역슬래시

        System.out.println("아 \"안돼\""); // \" : "사용

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
