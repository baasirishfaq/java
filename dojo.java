import java.util.Scanner;

public class dojo {

    public static void main(String args[]) {

        float num1, num2;
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = sc.nextFloat();

        System.out.print("Enter the symbol of operation you want on these numbers: + - * / :");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("The sum of the two numbers is: " + (num1 + num2));
                break;
            case '-':
                System.err.println("The difference of the two numbers isL " + (num1 - num2));
                break;
            case '*':
                System.err.println("The multiplication of the two numbers is : " + (num1 * num2));
                break;
            case '/':
                System.err.print("The division of the two numbers is :" + (num1 / num2));
                break;
        }
        sc.close();
    }
}