import java.io.*;
import java.util.*;

public class dojo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineNumber = 1;
        
        // Loop through input until EOF
        while (input.hasNextLine()) {
            String s = input.nextLine();
            System.out.println(lineNumber + " " + s);
            lineNumber++;
        }
        
        input.close();
    }
}
