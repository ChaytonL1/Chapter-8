package GameZone;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        int answer;
        int count = 0;
        Scanner input = new Scanner(System.in);
        String[] quizArray = new String[10];
        int [] answerArray = new int[10];

        questions(quizArray);
        answers(answerArray);

        System.out.println(quizArray[0]);
        answer = input.nextInt();
        if ( answer == answerArray[0])
        {
         System.out.println("Correct");
         count++;
        }
        else
            {
                System.out.println(" Wrong the answer was " + answerArray[0]);
            }
        System.out.println(quizArray[1]);
        answer = input.nextInt();
        if ( answer == answerArray[1])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[1]);
        }
        System.out.println(quizArray[2]);
        answer = input.nextInt();
        if ( answer == answerArray[2])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[2]);
        }
        System.out.println(quizArray[3]);
        answer = input.nextInt();
        if ( answer == answerArray[3])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[3]);
        }
        System.out.println(quizArray[4]);
        answer = input.nextInt();
        if ( answer == answerArray[4])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[4]);
        }
        System.out.println(quizArray[5]);
        answer = input.nextInt();
        if ( answer == answerArray[5])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[5]);
        }
        System.out.println(quizArray[6]);
        answer = input.nextInt();
        if ( answer == answerArray[6])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[6]);
        }
        System.out.println(quizArray[7]);
        answer = input.nextInt();
        if ( answer == answerArray[7])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[7]);
        }
        System.out.println(quizArray[8]);
        answer = input.nextInt();
        if ( answer == answerArray[8])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[8]);
        }
        System.out.println(quizArray[9]);
        answer = input.nextInt();
        if ( answer == answerArray[9])
        {
            System.out.println("Correct");
            count++;
        }
        else
        {
            System.out.println(" Wrong the answer was " + answerArray[9]);
        }




    }
    public static void questions(String quizArray[])
    {
        quizArray[0] = " Test 0";
        quizArray[1] = " Test 1";
        quizArray[3] = " Test 3";
        quizArray[4] = " Test 4";
        quizArray[5] = " Test 5";
        quizArray[6] = " Test 6";
        quizArray[7] = " Test 7";
        quizArray[8] = " Test 8";
        quizArray[9] = " Test 9";
    }
    public static void answers(int answerArray[])
    {
        answerArray[0] = 3;
        answerArray[1] = 1;
        answerArray[2] = 2;
        answerArray[3] = 2;
        answerArray[4] = 1;
        answerArray[5] = 3;
        answerArray[6] = 1;
        answerArray[7] = 2;
        answerArray[8] = 3;
        answerArray[9] = 1;
    }
}
