import java.util.Scanner;
import java.util.Random;

public class dojo {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(50) + 1;

        // System.out.println("The number is " + number);

        System.out.print("enter your guess: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        int attempts = 1;
        int allowed = 7;

        while (guess != number) {
            if (attempts == allowed) {
                System.out.println("you have reached the maximum number of attempts you lose");
                break;
            }
            if (Math.abs(guess - number) <= 5) {
                System.out.println("you are very close");
            } else if (Math.abs(guess - number) <= 10) {
                System.out.println("You're close but not close enough");
            } else if (Math.abs(guess - number) <= 20) {
                System.out.println("getting closer");
            } else if (guess > number) {
                System.out.println("too high not even close");
            } else if (guess < number) {
                System.out.println("too low not even close");
            }
            System.out.print("try again: ");
            guess = input.nextInt();
            attempts++;
        }
        if (guess == number) {
            System.out.println("correct! it took you " + attempts + " attempts");
        }
        input.close();
    }
}