package Excercises;

import javafx.beans.binding.DoubleExpression;

import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userEntry;
        double score;
        double average;
        double distance;
        double total = 0;
        System.out.println(" How many numbers will you be entering? ");

        userEntry = input.nextInt();
        double[] values = new double[userEntry];

        for (int i =0; i < values.length; i++)
        {
            System.out.println(" Enter a value. >>>");
            values[i] = input.nextDouble();
            total = values[i] + total;
        }
        average = total/values.length;
        System.out.println(" The average is " + average);
        for (int j = 0; j < values.length; j++)
        {
            distance = average - values[j];
            System.out.println(values[j] + " is " + distance + " away from the average.");
        }

    }
}
