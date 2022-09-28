/**
 * @author lohbecjz@mail.uc.edu
 */

import java.util.Scanner;
import java.util.Random;

public class Lab_06_05_HighorLow
{
    public static void main(String[] args)
    {
        // Declare variables
        Random generator = new Random();
        Scanner in = new Scanner(System.in);

        int val = generator.nextInt(10) + 1; // val is 1 to 10
        int guess = 0;
        String trash = "";

        // Prompt and input
        System.out.print("Try to guess my number. It is between 1 and 10: ");
        if (in.hasNextInt())
        {
            guess = in.nextInt();
            in.nextLine(); //clear the buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number.");
            System.exit(0); // terminate the program
        }
        if ((guess < 1) || (guess > 10))
        {
            System.out.println(guess + " is not between 1 and 10.");
            System.exit(0); // terminate the program
        }
        else if (guess == val)
        {
            System.out.println("My number is " + val + ", your guess is right on the money!");
        }
        else if (guess < val)
        {
            System.out.println("My number is " + val + ", your guess is low!");
        }
        else
        {
            System.out.println("My number is " + val + ", your guess is high!");
        }
    }
}