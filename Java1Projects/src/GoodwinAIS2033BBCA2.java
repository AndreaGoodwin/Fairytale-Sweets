/** Program Purpose: Create a program that allows a customer from Fairytale Sweets to purchase one or more of the candies. 
  *                  The program will then allow a customer to add more purchases and once finished print out 
  *                  their customer receipt. 
  *                  
  *                  The receipt will contain the date and time of the transaction.
  * Programmer: Andrea Goodwin
  * Class: IS 2033-CY1
  * version 2.0 2020/03/27 17:50
  * 
 * 
 */


import java.util.Scanner;
import java.util.Calendar;


public class GoodwinAIS2033BBCA2 {
  
  
 public static void main(String[] args) { 
    
  int quantity, formatFirstItem, choice;
  char proceed;
  double price, itemTotal, subtotal, taxAmount, total;
  final double TAX_RATE;
  String salesReceipt, candy;
  boolean purchasesMade = false;//will control whether the sales receipt is printed or not

  TAX_RATE = 0.0825;
  subtotal = 0;
  salesReceipt = " ";
  quantity = 0;
  price = 0;
  itemTotal = 0;
  
  formatFirstItem = 0;
  candy = " ";

  Scanner input = new Scanner(System.in);

  System.out.printf("%nDo you want to proceed with your candy purchase? \'Y\' or \'N\': ");
//while loop will start when y is pressed
  proceed = input.nextLine().charAt(0);
     if (Character.toUpperCase(proceed) != 'Y') {
      purchasesMade = false;
   System.out.printf("%nThank you for visiting Fairytale Sweets! Please come again.%n");
    System.exit(0);
     }
  
  while (Character.toUpperCase(proceed) == 'Y') {
    
   purchasesMade = true;
   choice = 0;
   price = 0.0;
  
   
   //menu options
   System.out.printf("%nFAIRYTALE SWEETS"
     + "%n%n1. Arabian Nights Chocolate Coins - 1 lb. Bag %5s%,7.2f"
     + "%n2. Beauty and the Beast Lollipops - 1 lb. Bag %,12.2f"
     + "%n3. Mad Hatter Jelly Beans - 1 lb. Bag %,20.2f"
     + "%n4. Pinocchio's Candy Cones - Each %,23.2f"
     + "%n5. Sleeping Beauty Caramel Apples - Each %,17.2f"
     + "%n%nEnter your choice: ", "$", 2.25, 2.50, 1.75, 0.75, 1.25); 
   //while loop to check if int is entered if not it will display error message.
  while(!input.hasNextInt()){
     input.next();
     System.out.printf("Please enter an Integer! Re-Enter your choice. : ");
   }
       choice = input.nextInt();
       
   switch(choice){   
   //if statement when choice 1 is entered
     case 1: 
      candy = ("Arabian Nights Cholocate Coins");
      price = 2.25 ;
      System.out.printf("You chose %s this candy is %.2f.%n ", candy, price);
      System.out.printf("%nQuantity for %s:  ", candy);
      quantity = 0;
      while(!input.hasNextInt()){
     input.next();
     System.out.printf("Please enter an Integer! Re-Enter your choice. : ");
   }
       quantity = input.nextInt();
      
      System.out.printf("You would like %d %s. %n", quantity, candy);
      itemTotal = quantity * price;
      subtotal += itemTotal;
      formatFirstItem = 1;
      //process for making any changes
      System.out.printf("%nDo you want to make any changes to the following "
                         + "selection? "
                         + "%n%n%s"
                         + "%n     %d @ $%.2f ea. %15s$%,.2f"
                         + "%n%nEnter \'Y\' or \'N\' : ", candy, quantity, price, " ",
                              itemTotal);
       proceed = input.next().charAt(0);   
       
    if(Character.toUpperCase(proceed) == 'Y');
    {
      break; // END if choice is option 1
    }
     // process for when item 2 is chosen 
   
    case 2 : 
       candy = ("Beauty and the Beast Lollipops");
       price = 2.50 ;
       System.out.printf("You chose %s this candy is %.2f.%n ", candy, price);
       System.out.printf("%nQuantity for %s:  ", candy);
       quantity = 0;
      while(!input.hasNextInt()){
     input.next();
     System.out.printf("Please enter an Integer! Re-Enter your choice. : ");
   }
       quantity = input.nextInt();
        
       System.out.printf("You would like %d %s. %n", quantity, candy);
       itemTotal = quantity * price;
       subtotal += itemTotal;
       formatFirstItem = 2;
     
         
     System.out.printf("%nDo you want to make any changes to the following "
            + "selection? "
            + "%n%n%s"
            + "%n     %d @ $%.2f ea. %15s$%,.2f"
            + "%n%nEnter \'Y\' or \'N\' : ", candy, quantity, price, " ",
                     itemTotal);
       proceed = input.next().charAt(0);   
       
    if(Character.toUpperCase(proceed) == 'Y');
    {

     break;// END if choice is option 2
    }

    //process when item 3 is ordered 
     
     case 3 : 
       candy = ("Mad Hatter Jelly Beans");
       price = 1.75 ;
       System.out.printf("You chose %s this candy is %.2f.%n ", candy, price);
       System.out.printf("%nQuantity for %s:  ", candy);
       quantity = 0;
       while(!input.hasNextInt()){
     input.next();
     System.out.printf("Please enter an Integer! Re-Enter your choice. : ");
   }
       quantity = input.nextInt();
     
       System.out.printf("You would like %d %s. %n", quantity, candy);
       itemTotal = quantity * price;
       subtotal += itemTotal;
       formatFirstItem = 3;
      System.out.printf("%nDo you want to make any changes to the following "
                         + "selection? "
                         + "%n%n%s"
                         + "%n     %d @ $%.2f ea. %15s$%,.2f"
                         + "%n%nEnter \'Y\' or \'N\' : ", candy, quantity, price, " ",
                              itemTotal);
   
       proceed = input.next().charAt(0); 
       
    if(Character.toUpperCase(proceed) == 'Y');
    {
     break; // END if choice is option 3
    }
         
     //process for if item 4 is ordered
      
     case 4 :  
        candy = ("Pinocchio's Candy Cones");
        price = 0.75 ;
        System.out.printf("You chose %s this candy is %.2f.%n ", candy, price);
        System.out.printf("%nQuantity for %s:  ", candy);
        quantity = 0;
          while(!input.hasNextInt()){
     input.next();
     System.out.printf("Please enter an Integer! Re-Enter your choice. : ");
   }
        quantity = input.nextInt(); 
        System.out.printf("You would like %d %s. %n", quantity, candy);
        itemTotal = quantity * price;
        subtotal += itemTotal;
        formatFirstItem = 4;
     System.out.printf("%nDo you want to make any changes to the following "
                         + "selection? "
                         + "%n%n%s"
                         + "%n     %d @ $%.2f ea. %15s$%,.2f"
                         + "%n%nEnter \'Y\' or \'N\' : ", candy, quantity, price, " ",
                              itemTotal);
      
       proceed = input.next().charAt(0);   
       
    if(Character.toUpperCase(proceed) == 'Y');
    {
      break; // END if choice is option 4
    }
                       
       //process if item 5 is ordered
       
     case 5 : 
         candy = ("Sleeping Beauty Caramel Apples");
         price = 1.25 ;
         System.out.printf("You chose %s this candy is %.2f.%n ", candy, price);
         System.out.printf("%nQuantity for %s:  ", candy);
         quantity = 0;
           while(!input.hasNextInt()){
     input.next();
     System.out.printf("Please enter an Integer! Re-Enter your choice. : ");
   }
         quantity = input.nextInt(); 
         System.out.printf("You would like %d %s. %n", quantity, candy);
         itemTotal = quantity * price;
         subtotal += itemTotal;
         formatFirstItem = 5;
            
          System.out.printf("%nDo you want to make any changes to the following "
                  + "selection? "
                  + "%n%n%s"
                  + "%n     %d @ $%.2f ea. %15s$%,.2f"
                  + "%n%nEnter \'Y\' or \'N\' : ", candy, quantity, price, " ",
                         itemTotal);
       proceed = input.next().charAt(0);  
       

    if(Character.toUpperCase(proceed) == 'Y');
    {
       break;// END if choice is option 5
    } 
     default: System.out.printf("%nInvalid choice. Try again!%n");
     
   } //END Switch
   
   if (formatFirstItem == 1)
       {
        salesReceipt += String.format("%n%s"
          + "%n    %d @ $%.2f ea. %-24s $%,10.2f%n", candy,
          quantity, price, " ", itemTotal);
       } 
       // receipt format if item is not first item ordered
       else 
        
       {
        salesReceipt += String.format("%s"
          + "%n     %d @ $%.2f ea. %-25s %,10.2f%n", candy, quantity,
          price, " ", itemTotal);
       } //END if formatFirstItem is 1 or else formatFirstItem NOT 1
       
   // message sent to ask if customer would like to continue ordering
   System.out.printf("%nWould you like to make another candy purchase?"
     + "Enter 'Y' or 'N':  %n");
   proceed = input.next().charAt(0);       

  } //END while 
  
  
  if (purchasesMade = true) {
   System.out.printf("%nProceeding to checkout.");
  }
  
  
  
  //foramt for top of receipt
  System.out.printf("%n%nFAIRYTALE SWEETS%n"
    +"North Star Mall%n"
    +"San Antonio, TX %n%n"); //top to receipt 
  Calendar dateTime = Calendar.getInstance();
  System.out.printf("Date: %tD\n", dateTime); //get date
  System.out.printf("Time: %tr\n%n", dateTime);//get time


  //process for getting the tax added to receipt
  taxAmount = TAX_RATE * subtotal;
  total = taxAmount + subtotal;
  //sales receipt format
  salesReceipt += String.format("%n%36s %-6s $%,10.2f"
    + "%n%36s %-7s %,10.2f"
    + "%n%n%36s %-6s $%,10.2f%n", "SUBTOTAL:    ", " ",
    subtotal, "TAX @ 8.125%: ", " ", taxAmount,
    "TOTAL: ", " ", total);
  System.out.printf("%s", salesReceipt);
  System.out.printf("%nThank you for your business! Please come again!%n");

  System.exit(0); //Exit program 
     
  } //End Main Method

} //END GoodwinAIS2033BBCA2

/*
 **** EXPECTED OUTPUT****** 
Do you want to proceed with your candy purchase? 'Y' or 'N':  [DrJava Input Box]
 
FAIRYTALE SWEETS 
 
1. Arabian Nights Chocolate Coins - 1 lb. Bag     $   2.25 
2. Beauty and the Beast Lollipops - 1 lb. Bag         2.50 
3. Mad Hatter Jelly Beans - 1 lb. Bag                 1.75 
4. Pinocchio's Candy Cones - Each                    0.75 
5. Sleeping Beauty Caramel Apples - Each              1.25 
 
Enter your choice:  [DrJava Input Box]
 
Invalid choice. Try again! 
 
Would you like to make another candy purchase?Enter 'Y' or 'N':   
 [DrJava Input Box]
 
FAIRYTALE SWEETS 
 
1. Arabian Nights Chocolate Coins - 1 lb. Bag     $   2.25 
2. Beauty and the Beast Lollipops - 1 lb. Bag         2.50 
3. Mad Hatter Jelly Beans - 1 lb. Bag                 1.75 
4. Pinocchio's Candy Cones - Each                    0.75 
5. Sleeping Beauty Caramel Apples - Each              1.25 
 
Enter your choice:  [DrJava Input Box]
 
Invalid choice. Try again! 
 
Would you like to make another candy purchase?Enter 'Y' or 'N':   
 [DrJava Input Box]
 
FAIRYTALE SWEETS 
 
1. Arabian Nights Chocolate Coins - 1 lb. Bag     $   2.25 
2. Beauty and the Beast Lollipops - 1 lb. Bag         2.50 
3. Mad Hatter Jelly Beans - 1 lb. Bag                 1.75 
4. Pinocchio's Candy Cones - Each                    0.75 
5. Sleeping Beauty Caramel Apples - Each              1.25 
 
Enter your choice:  [DrJava Input Box]
Please enter an Integer! Re-Enter your choice. :  [DrJava Input Box]
You chose Arabian Nights Cholocate Coins this candy is 2.25. 
  
Quantity for Arabian Nights Cholocate Coins:   [DrJava Input Box]
You would like 3 Arabian Nights Cholocate Coins.  
 
Do you want to make any changes to the following selection?  
 
Arabian Nights Cholocate Coins 
     3 @ $2.25 ea.                $6.75 
 
Enter 'Y' or 'N' :  [DrJava Input Box]
 
Would you like to make another candy purchase?Enter 'Y' or 'N':   
 [DrJava Input Box]
 
FAIRYTALE SWEETS 
 
1. Arabian Nights Chocolate Coins - 1 lb. Bag     $   2.25 
2. Beauty and the Beast Lollipops - 1 lb. Bag         2.50 
3. Mad Hatter Jelly Beans - 1 lb. Bag                 1.75 
4. Pinocchio's Candy Cones - Each                    0.75 
5. Sleeping Beauty Caramel Apples - Each              1.25 
 
Enter your choice:  [DrJava Input Box]
You chose Beauty and the Beast Lollipops this candy is 2.50. 
  
Quantity for Beauty and the Beast Lollipops:   [DrJava Input Box]
You would like 3 Beauty and the Beast Lollipops.  
 
Do you want to make any changes to the following selection?  
 
Beauty and the Beast Lollipops 
     3 @ $2.50 ea.                $7.50 
 
Enter 'Y' or 'N' :  [DrJava Input Box]
 
Would you like to make another candy purchase?Enter 'Y' or 'N':   
 [DrJava Input Box]
 
FAIRYTALE SWEETS 
 
1. Arabian Nights Chocolate Coins - 1 lb. Bag     $   2.25 
2. Beauty and the Beast Lollipops - 1 lb. Bag         2.50 
3. Mad Hatter Jelly Beans - 1 lb. Bag                 1.75 
4. Pinocchio's Candy Cones - Each                    0.75 
5. Sleeping Beauty Caramel Apples - Each              1.25 
 
Enter your choice:  [DrJava Input Box]
You chose Pinocchio's Candy Cones this candy is 0.75. 
  
Quantity for Pinocchio's Candy Cones:   [DrJava Input Box]
Please enter an Integer! Re-Enter your choice. :  [DrJava Input Box]
You would like 5 Pinocchio's Candy Cones.  
 
Do you want to make any changes to the following selection?  
 
Pinocchio's Candy Cones 
     5 @ $0.75 ea.                $3.75 
 
Enter 'Y' or 'N' :  [DrJava Input Box]
 
Would you like to make another candy purchase?Enter 'Y' or 'N':   
 [DrJava Input Box]
 
Proceeding to checkout. 
 
FAIRYTALE SWEETS 
North Star Mall 
San Antonio, TX  
 
Date: 03/30/20
Time: 10:49:04 AM

 
Arabian Nights Cholocate Coins 
    3 @ $2.25 ea.                          $       6.75 
Beauty and the Beast Lollipops 
     3 @ $2.50 ea.                                 7.50 
Pinocchio's Candy Cones 
     5 @ $0.75 ea.                                 3.75 
 
                       SUBTOTAL:            $     18.00 
                      TAX @ 8.125%:                1.49 
 
                             TOTAL:         $     19.49 
 
Thank you for your business! Please come again! 
>*/

