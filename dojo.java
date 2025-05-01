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
                System.out.println("you have reached the maximum number of attempts you lose" +" the number was "+ number);
                break;
            }
            if (Math.abs(guess - number) <= 2) {
                System.out.println("Almost there");
            } else if (Math.abs(number - guess) <= 5) {
                System.out.println("Even closer");
            } else if (Math.abs(guess - number) <= 10) {
                System.out.println("You're close but not close enough");
            } else if (Math.abs(guess - number) <= 20) {
                System.out.println("getting closer");
            } else if (guess > number) {
                System.out.println("too high ");
            } else if (guess < number) {
                System.out.println("too low ");
            }
            System.out.print("try again: ");
            guess = input.nextInt();
            attempts++;
        }
        if (guess == number) {
            System.out.println("correct! it took you " + attempts + " attempts " + "the number was "+ number);
        }
        input.close();
    }
}