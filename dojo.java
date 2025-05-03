import java.util.Scanner;

public class dojo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String language = sc.next(); // e.g. "java"
            int score = sc.nextInt();    // e.g. 100

            // Format string: %-15s means left-align string in 15 characters
            // %03d means pad the number with leading 0s to make 3 digits
            System.out.printf("%-15s%03d%n", language, score);
        }

        System.out.println("================================");
        sc.close();
    }
}