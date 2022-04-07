/*Day3 Problem5 = Java Program to print the elements of an array present on an even position*/

import java.util.Scanner;

public class Array5 {

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

        System.out.print("Even Positions no. are: ");
        for (int i=1;i<a.length;i=i+2)
        {
            System.out.print("\t" + a[i]);
        }

    }

}
