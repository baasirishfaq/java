import java.util.Scanner;

public class grader {
    public static void main(String[] args) {
        // make an intger array of user's size
        String[] names = new String[2];
        int[][] grades = new int[2][2];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = input.nextLine();
            names[i] = name;
        }

        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Entering Grades of Student " + (i + 1) + ": ");
            for (int j = 0; j < 2; j++) 
            {
                System.out.print("Enter the marks of subject : " + (j + 1) + " : ");
                grades[i][j] = input.nextInt();
            }
            input.nextLine(); // Consume the newline character left by nextInt()
        }

        for (int i = 0; i < 2; i++) {
            // System.out.println("The name of student " + (i + 1) + " is: " + names[i]);
            System.out.println("The grades of " + names[i] + " are: ");
            for (int j = 0; j < 2; j++) 
            {
                System.out.println("Subject " + (j+1) + " Marks = " + grades[i][j] + " ");
            }
            System.out.println();

            int sum = 0;
            for (int j = 0; j < 2; j++) 
            {
                sum += grades[i][j];
            }
            double avg = (double) sum / 2;
            System.out.println("The average for " + names[i] + " is: " + avg);
            if(avg >= 50)
            {
                System.out.println("The student " + names[i] + " has passed.");
            }
            else
            {
                System.out.println("The student " + names[i] + " has failed.");
            }
            System.out.println();
        }

    }
}
