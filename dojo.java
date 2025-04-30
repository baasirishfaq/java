import java.util.Scanner;

public class dojo {

    public static void main(String[] args)
    {
        // make an array of size 10
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++)
        {
            System.out.print("enter the number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        for(int it: arr)
        {
            System.out.print(it + " ");
        }
        sc.close();
    }
}