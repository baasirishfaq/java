import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner nameMeAnything = new Scanner(System.in); // to declare that i am seeking keyboard input from the user

        System.out.print("enter your name: ");
        // simple message asking user what to input
        // println is not being used because println leaves a newline.

        String name = nameMeAnything.nextLine();
        /*
         * scanner catches the user input
         * a string called name is used to store that value which the user gave so we
         * can reuse the value when ever we want
         * using nextLine() spaces can also be read, it can read a full name example "John Doe".
         * use next() if spaces are not needed to be read.
         */

        System.out.print("enter your age: ");
        int age = nameMeAnything.nextInt();

        System.out.print("what your float code: ");
        float code = nameMeAnything.nextFloat();
        System.out.println("Hello " + name + " welcome on board " + age + " " + code); // simple print line and the user's value is
                                                                          // being used here

        nameMeAnything.close(); // close the scanner tag
    }
}
