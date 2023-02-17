package chap_06;

public class _03_Return {
    public static String getPhoneNumber (){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;

    }

    public static String getAddress(){

        return "서울시 어딘가";
    }

    public static String getActivities() {
        return "볼링장, 탁구장";
    }
    public static void main(String[] args) {
        String phoneNumber = getPhoneNumber();
        System.out.println(phoneNumber);
        String getAddress = getAddress();
        System.out.println(getAddress);
        String getActivities = getActivities();
        System.out.println(getActivities);

    }
}
