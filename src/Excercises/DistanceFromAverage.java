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
        System.out.println(" How many number will you be entering? ");

        userEntry = input.nextInt();
        double[] values = new double[userEntry];

        for (int i =0; i < values.length; i++)
        {
            System.out.println(" Enter a value. >>>");
            score = input.nextDouble();
            values[i] = score;
            total = values[i] + total;
        }
        average = total/values.length;
        for (int j = 0; j < values.length; j++)
        {
            distance = values[j] - average;
            System.out.println(values[j] + " is " + distance + " away from the average which is == " + average);
        }

    }
}
