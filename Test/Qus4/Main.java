package Ques4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (UserMainCode.validatePassword(a) == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
