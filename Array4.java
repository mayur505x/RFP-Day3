/*Day3 Problem4 = Java Program to print the smallest element in an array*/

import java.util.Scanner;

public class Array4 {

    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter lenght of Array: ");
        int n = scan.nextInt();
        int a[] = new int[n];


        System.out.println("Enter Elements");
        for (int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int min = a[0];
        for (int i=1;i<n;i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }

        }

        System.out.println("Smallest Element is: " + min);

    }

}
