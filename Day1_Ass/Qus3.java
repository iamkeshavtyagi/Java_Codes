package Day1_Ass;

import java.util.Scanner;
public class  Qus3
{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);

  System.out.println("Welcome to Hotel(All types of INDIAN food available here) ");
  System.out.println();


  while(true)
  {
    System.out.println("Enter 1 : To order South Indian Dish");
    System.out.println("Enter 2 : To order North Indian Dish");
    System.out.println("Enter 3 : To order Rajasthani Dish");
    System.out.println("Enter 4 : To order Gujrati Dish");
    System.out.println("Enter 5 : To order Bengali Dish");
    System.out.println("Enter 6 : To order Desserts");
    System.out.println("Enter 7 : To Exit");

    System.out.println();
    System.out.println("Enter your choice::");
    int choice = scan.nextInt();

   switch(choice)
   {
     case 1:
     System.out.println("Welcome to South Indian Food Court");
     southIndianFood();
     break;
    
     case 2:
     System.out.println("Welcome to North Indian Food Court");
     northIndianFood();
     break;
    
     case 3:
     System.out.println("Welcome to Rajasthani Food Court");
     rajasthaniFood();
     break;
    
     case 4:
     System.out.println("Welcome to Gujrati Food Court");
     gujratiFood();
     break;
    
     case 5:
     System.out.println("Welcome to Bengali Food Court");
     bengaliFood();
     break;
    
     case 6:
     System.out.println("Welcome to Desserts Food Court");
     desserts();
     break;
    
     case 7:
     System.out.println("Thanks for ordering here \nVisit Again");
     System.exit(0);
     break;
    
     default:
     System.out.println("Incorrect input!! Please re-enter a Correct choice from our menu");
   }
  }
 }

 public static void southIndianFood()
 {
  System.out.println("You get:");
  System.out.println("Idli : 2 Pieces:");
  System.out.println("Butter Cheese Dosa : 1 Pieces:");
  System.out.println("Vada : 2 Pieces:");
  System.out.println("Total Bill:900");
  System.out.println("Woow your order>500 You will get free desert");
  desserts();

 }

 public static void northIndianFood()
 {
  System.out.println("You get:");
  System.out.println("Chole Bhature : 2 Pieces:");
  System.out.println("Litti Chokha : 4 Pieces:");
  System.out.println("Total Bill:500 To get discount order above 500");

 }

 public static void rajasthaniFood()
 {
  System.out.println("You get:");
  System.out.println("Dal Baati Churma");
  System.out.println("Laal maas");
  System.out.println("Methi Bajra puri");
  System.out.println("Total Bill:500 No Discount Sorry");
 }

 public static void gujratiFood()
 {
  System.out.println("You get:");
  System.out.println("Dhokla : 2 pieces");
  System.out.println("Khandvi");
  System.out.println("Methi ka Thepla");
  System.out.println("Total Bill:600");
  System.out.println("Total Bill:500 To get discount order above 500");

  desserts();
 }

 public static void bengaliFood()
 {
  System.out.println("You get:");
  System.out.println("Maach Bhaat");
  System.out.println("Aalu Luchi");
  System.out.println("Total Bill:400 No Discount" );
 }

 public static void desserts()
 {
  System.out.println("You get:");
  System.out.println("Rasmalai");
  System.out.println("Rasgulla : 2 Pieces");
  System.out.println("Emarti : 2 Pieces");
  System.out.println("Gajar ka halwa");
 }

}