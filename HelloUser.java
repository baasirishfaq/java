import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = userinput.nextLine();
        System.out.print("Enter your ID number: ");
        int id = userinput.nextInt();
        userinput.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Welcome " + name + "!" + "Your ID number is " + id);
        userinput.close();
    }
}