package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계 (contains, indexOf, lastIndexOf, startsWith, endsWith)
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); //7
        System.out.println(s.indexOf("C#")); // -1 (포함되지 않으면 -1 출력)
        System.out.println(s.indexOf("and")); // 12 -> 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and"));// 23 -> 마지막 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith("."));// 이 문자열로 끝나면 true
    }
}
