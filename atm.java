/*OASIS INFOBYTE JAVA PROGRAMMING INTERNSHIP TASK-3
 ATM INTERFACE */
import java.io.*;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
  int account_number; 
  float deposit=0,withdraw=0;

  Scanner sc=new Scanner(System.in);
   System.out.println("Enter your Name-");
  String name=sc.nextLine();

  System.out.println("Enter Account Number-");
  account_number=sc.nextInt();

  System.out.println("Enter Balance-");
  float balance=sc.nextFloat();
 
  while(true)
  {
    System.out.println("1) DEPOSIT MONEY");
    System.out.println("2) WITHDRAW MONEY");
    System.out.println("3) CHECK BALANCE");
    System.out.println("4) EXIT");
    System.out.println("Please Enter your Choice-");
    int choice=sc.nextInt();
      if(choice==1)
       {System.out.println("Enter money to deposit-");
              deposit=sc.nextFloat();
              balance=balance+deposit;}
      else if(choice==2){System.out.println("Enter amount to withdraw");
              withdraw=sc.nextFloat();
              if(withdraw>balance)
              {
                System.out.println("INSUFFICIENT BALANCE!");
              }
              else if(withdraw<=balance){
                balance=balance-withdraw;
                System.out.println("WITHDRAW SUCCESSFUL!");
              }}
      else if(choice==3){ 
        System.out.println("Your Account Balance is INR "+balance);}
      else if(choice==4){
        System.out.println("Thank You "+name+" For Using the ATM...Please visit again");
      break;}
    }
  }
  }    
 

