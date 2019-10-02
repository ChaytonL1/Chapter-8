package Excercises;

import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        int userEntry;

        int[] twelve = {1,2,3,4,5,6,7,8,9,10,11,12};

        for(int i = 0; i < twelve.length; i++)
        {
            System.out.println(twelve[i]);
        }
        for(int j = 11; j > -1; j--)
        {
            System.out.println(twelve[j]);
        }
    }
}
