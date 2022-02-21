package Test;

import java.util.*;

public class UserMainCode{
  public static int calculateElectricityBill(String inp, String inpu, int input) {
    int n1 = Integer.parseInt(inp.substring(5, inp.length()));
    int n2 = Integer.parseInt(inpu.substring(5, inpu.length()));
    int n = Math.abs((n2 - n1) * input);
    return n;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int n = sc.nextInt();
    int n1 = calculateElectricityBill(s1, s2, n);
    System.out.println(n1);
  }
}
