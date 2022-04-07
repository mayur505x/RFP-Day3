

import java.util.Scanner;
/*Day 3 Problem9 = Java Program to sort the elements of an array in ascending order*/  

public class Array9 {

    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter lenght of Array: ");
        int n = scan.nextInt();
        int a[] = new int[n];
        int c = 0;

        System.out.println("Enter Elements");
        for (int i=0;i< n;i++)
        {
            a[i] = scan.nextInt();
        }

        for (int i=0;i< a.length;i++)
        {
            for (int j=i+1;j< a.length;j++)
            {
                if(a[i] < a[j])
                {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                    
            }

        }
        System.out.println("Element in ascending order: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

}
