import java.util.Scanner;

public class dojo {

    public static void main(String[] args) {
        int password = 1234;
        int guessLeft = 3;
        Scanner pass = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.print("Enter your password: ");
            int guess = pass.nextInt();

            if (guess == password) {
                System.out.println("Welcome Access Granted!");
                break;
            } else {
                guessLeft--;
                System.out.println("Wrong password! You have " + guessLeft + " guesses left.");
            }
            if (guessLeft == 0) {
                System.out.println("You have been locked out.");
            }
        }
    }
}