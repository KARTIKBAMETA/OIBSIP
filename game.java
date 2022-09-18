/*OASIS INFOBYTE JAVA PROGRAMMING INTERNSHIP TASK-2 */
//NUMBER GUESSING GAME 
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class game{
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(100)+1;
        int count=0;
        while(true)
        {
            System.out.println("ENTER A NUMBER TO GUESS BETWEEN 1-100");
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
            count++;
            if(guess==num)
            {
                System.out.println("Hurrah!!! Y O U  W I N !");
                System.out.println("You won in "+count+" tries");
                break;
            }
            else if(guess>num)
            {System.out.println("Your guess is Too HIGH..Guess Again!!");
        }
        else if(guess<num)
        {
            System.out.println("Your guess is Too LOW..Guess AGAIN!!");
        }
        }
    }
}
