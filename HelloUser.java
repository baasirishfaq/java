import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][2];
        String[] names = new String[2];
        double avg = 0, sum = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the name of the student " + (i + 1) + ": ");
            names[i] = input.nextLine();
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter the marks of subject " + (j + 1) + ": ");
                arr[i][j] = input.nextInt();
            }
            input.nextLine(); // Consume the newline character left by nextInt()
        }
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("The name of the student is " + names[i] + "\n");
            for (int j = 0; j < 2; j++) {
                System.out.println("The marks of subject " + (j + 1) + " : " + arr[i][j] + "\n");
                sum = sum + arr[i][j];
            }
            avg = sum / 2.0;
            if (avg >= 50) {
                System.out.println("The student " + names[i] + " has passed with avg: " + avg + "\n");
            } else {
                System.out.println("The student " + names[i] + " has failed with avg: " + avg + "\n");
            }
            sum = 0; // Reset sum for the next student
        }
    }
}