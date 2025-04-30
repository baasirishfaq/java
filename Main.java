import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        System.out.println("the number is " + number);

        System.out.print("enter your guess: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int attempts = 1;
        int maxAttempts = 10;
        while (guess != number) {
            if (Math.abs(guess - number) <= 10) {
                System.out.println("close");
            } else if (guess < number) {
                System.out.println("too low");

            } else {
                System.out.println("too high");
            }
            if (attempts == maxAttempts) {
                System.out.println("you have reached the maximum number of attempts");
                break;
            }
            System.out.print("try again: ");
            guess = input.nextInt();
            attempts++;
        }
        if (guess == number)

        {
            System.out.println("correct! it took you " + attempts + " attempts");
        }
    }
}