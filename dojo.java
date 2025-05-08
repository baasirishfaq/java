import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String reversedStr = "";

        for (int i = 0; i < A.length(); i++) 
        {
            reversedStr = A.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr.equals(A) ? "Yes" : "No");
        sc.close();
    }
}
