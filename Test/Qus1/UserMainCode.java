package Ques1;

public class UserMainCode {
    public static int calculateElectricityBill(String s1, String s2, int c) {
        int a = Integer.parseInt(s1.substring(5));
        int b = Integer.parseInt(s2.substring(5));
        int res = Math.abs((b - a) * c);
        return res;
    }
}
