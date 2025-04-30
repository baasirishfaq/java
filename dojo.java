import java.util.Scanner;

public class dojo {

    public static void main(String[] args) {
        String password = "Java234";
        int attempts = 3;
        Scanner pass = new Scanner(System.in);

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your password: ");
            String input = pass.nextLine();

            if (input.equals(password))
            /*
             * if(input == password does not work here) it can only work for char or int
             * because it compares the memory address of the string here we are using a mixture of
             * chars and ints in a string
             * so we use equals method to compare the string values
             * if(input.equal(passowrd)) is to be used here...
             */

            {
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