package Day1_Ass;

import java.util.Scanner;

public class Qus2{

    public static void main(String[] args) {

       // declare variables
       int year = 0;
       boolean result = false;

       // create Scanner class object to read input
       Scanner scan = new Scanner(System.in);

       // read input
       System.out.print("Enter year:: ");
       year = scan.nextInt();

       // check year is leap year or not
       if(( year%4==0) && ( (year%400==0) || (year%100!=0) ) )
            result = true;
       else
            result = false;

       // display result
       if(result == true) 
           System.out.println(year+" is a leap year");
       else System.out.println(year+" is not a leap year");

       // close Scanner class object
      // scan.close();

    }
 }
