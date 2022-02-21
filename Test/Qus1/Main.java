package Ques1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int c=sc.nextInt();
        System.out.println(UserMainCode.calculateElectricityBill(s1,s2, c));
    }
}