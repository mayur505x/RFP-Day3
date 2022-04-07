/*Day 3 Problem8=  Java Program to print the duplicate elements of an array*/

import java.util.Scanner;

public class Array8 {

    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter lenght of Array: ");
        int n = scan.nextInt();
        int a[] = new int[n];

        System.out.println("Enter Elements");
        for (int i=0;i< n;i++)
        {
            a[i] = scan.nextInt();
        }

        System.out.print("Duplicates Elements in array:");
        for (int i=0;i< a.length;i++)
        {
            for (int j=i+1;j< a.length;j++)
            {
                if(a[i] == a[j])
                    System.out.print("\t" + a[j]);
            }

        }

    }

}
