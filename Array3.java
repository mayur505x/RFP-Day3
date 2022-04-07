/*Day3 Problem3 = Java Program to print the largest element in an array*/

import java.util.Scanner;

public class Array3 {

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

        int max = a[0];
        for (int i=1;i<n;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }

        }

        System.out.println("Maximum Element is: " + max);

    }

}
