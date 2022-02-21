package Ques4;

public class UserMainCode {
    static int validatePassword(String a) {
        int d = 0;
        if (a.length() >= 8) {
            if (a.contains("#") || a.contains("@") || a.contains("_")) {
                char c = a.charAt(0);
                if (Character.isAlphabetic(c)) {
                    char dd = a.charAt(a.length() - 1);
                    if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd))) {

                        return 1;

                    }

                }

            }

        }

        return -1;
    }

}
