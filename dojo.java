import java.util.Scanner;

public class dojo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        if (age < 13) {
            System.out.println("hey cool kid...");
        } else if (age >= 13 && age <= 21) {
            System.out.println("hey " + name + " adulting huh?...");
        } else if (age > 21 && age <= 61) {
            System.out.println("yo wassup " + name + " adult...");
        } else {
            System.out.println("hey " + name + " cool unc...");
        }
        scan.close();
    }
}
