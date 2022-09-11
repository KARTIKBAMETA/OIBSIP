/*OASIS INFOBYTE JAVA PROGRAMMING TASK-3 */
//NUMBER GUESSING GAME 
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class game{
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt(100)+1;
        int count=0;
        while(true)
        {
            System.out.println("ENTER A NUMBER BETWEEN 1-100:");
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
            count++;
            if(guess==num)
            {
                System.out.println("Hurrah!! Y O U  W I N...");
                System.out.println("You took "+count+" tries..");
                break;
            }
            else if(guess>num)
            {
                System.out.println("Your guess is too high.. GUESS AGAIN");
            }
            else if(guess<num)
            {
                System.out.println("Your guess is too low.. GUESS AGAIN");
            }
        }
    }
}
