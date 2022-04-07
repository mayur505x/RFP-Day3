/*Day3 Problem6 = Java Program to print the elements of an array in reverse order*/

import java.util.Scanner;

public class Array6 {

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

        System.out.print("Array elements are in reverse positions :");
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.print("\t" + a[i]);
        }

    }

}
