package Excercises;

import java.util.Scanner;

public class ArrayMethodDemo {
private static int total = 0;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int limit = 12;
        int [] array = new int[10];
        int total = 0;
        int average = 0;

        for(int i = 0; i < 10; i++)
        {
            System.out.println(" Enter a number >>> ");
            array[i] = input.nextInt();
            total = array[i] + total;
        }

        displayIntegers(array);
        System.out.println("   ");
        displayReverse(array);
        System.out.println("   ");
        displaySum(array,total);
        System.out.println("   ");
        displayAboveAverage(array,total,average);
    }
    public static void displayIntegers(int array[])
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(array[i]);
        }

    }
    public static void displayReverse(int array[])
    {
        for(int i = 9; i > 0; i--)
        {
            System.out.println(array[i]);
        }
    }
    public static void displaySum(int array[], int total)
    {

        System.out.println(" The total is " + total);

    }
    public static void displayAboveAverage(int array[], int total, int average)
    {

       average = total / array.length;
       System.out.println(" The average is >> " + average);
       for (int i = 0; i < 10; i++)
       {
           if ( array[i] > average)
           {
               System.out.println(array[i] + " Is above average.");
           }
           else if ( array[i] == average)
           {
               System.out.println(array[i] + " Is equal to the average.");
           }
           else
               {
                   System.out.println(array[i] + " Is below average.");
               }
       }
    }
//    public static void lessThanLimit(int array, int limit)
//    {
//        System.out.println(" All the number entered under the limit. ");
//        for (int i = 0; i < 10; i ++)
//        {
//            if(array [i] < limit)
//            {
//
//            }
//        }
//    }
}
