import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        String[] names = new String[2];
        int[][] grades = new int[2][2];

        Scanner input = new Scanner(System.in);
        Scanner marks = new Scanner(System.in);
        // for entering studnet names
        for (int i = 0; i < 2; i++) {

            System.out.print("Enter the name of student " + (i + 1) + " : ");
            names[i] = input.nextLine();

            for(int j = 0; j<2; j++)
            {
                System.out.print("MARKS OF SUBJECT " + (j + 1) + " : ");
                grades[i][j] = marks.nextInt();
                marks.nextLine(); // Consume the newline character left by nextInt()
            }
        }

        for(int i = 0; i < 2; i++)
        {
            double avg = (grades[i][0] + grades[i][1]) / 2.0;   
            System.out.println("The average of names " + names[i] + " is: " + avg );
            if(avg >= 50)
            {
                System.out.println("The student " + names[i] + " has passed.");
            }
            else
            {
                System.out.println("The student " + names[i] + " has failed.");
            }
        }
    }
}