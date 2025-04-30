import java.util.Scanner;

public class dojo {

    public static void main(String[] args) {
        int password = 1234;
        int attempts = 3;
        Scanner pass = new Scanner(System.in);

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your password: ");
            int input = pass.nextInt();
            if (input == password) {
                System.out.println("Welcome!");
                break;
            } else {
                System.out.println("incorrect password : ");
                System.out.println("you have " + (attempts - (i + 1)) + " tries left");
            }
            if (i == 2) {
                System.out.println("You have been locked out.");
            }
        }
        pass.close();
    }
}