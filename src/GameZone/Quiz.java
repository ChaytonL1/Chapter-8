package GameZone;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        int answer = 1;
        int count = 0;
        Scanner input = new Scanner(System.in);
        String[] quizArray = new String[10];
        int [] answerArray = new int[10];

        while  (answer != 999) {
        questions(quizArray);
        answers(answerArray);
        System.out.println(" Welcome to my quiz you may use a calculator but no phones, " +
                " also no talking or cheating or ill say Obama's last name. \n enter 999 when you want to quit. ");


        System.out.println(quizArray[0]);
        answer = input.nextInt();
        if (answer == answerArray[0] && answer != 999) {
            System.out.println("Correct");
            count++;
        }
        else if (answer != 999)
        {
            System.out.println(" Wrong the answer was " + answerArray[0]);
        }
        else
            {
                break;
            }

        System.out.println(quizArray[1]);
        answer = input.nextInt();
        if (answer == answerArray[1] && answer != 999) {
            System.out.println("Correct");
            count++;
        }
        else if (answer != 999)
        {
            System.out.println(" Wrong the answer was " + answerArray[1]);
        }
        else
        {
            break;
        }
        System.out.println(quizArray[2]);
        answer = input.nextInt();
        if (answer == answerArray[2] && answer != 999) {
            System.out.println("Correct");
            count++;
        }else if (answer != 999){
            System.out.println(" Wrong the answer was " + answerArray[2]);
        }
        else
        {
            break;
        }
        System.out.println(quizArray[3]);
        answer = input.nextInt();
        if (answer == answerArray[3] && answer != 999) {
            System.out.println("Correct");
            count++;
        }else if (answer != 999) {
            System.out.println(" Wrong the answer was " + answerArray[3]);
        }
        else
        {
            break;
        }
        System.out.println(quizArray[4]);
        answer = input.nextInt();
        if (answer == answerArray[4] && answer != 999) {
            System.out.println("Correct");
            count++;
        } else if (answer != 999) {
            System.out.println(" Wrong the answer was " + answerArray[4]);
        }
        else
        {
            break;
        }
        System.out.println(quizArray[5]);
        answer = input.nextInt();
        if (answer == answerArray[5] && answer != 999) {
            System.out.println("Correct");
            count++;
        } else if (answer != 999) {
            System.out.println(" Wrong the answer was " + answerArray[5]);
        }
        else
        {
            break;
        }
        System.out.println(quizArray[6]);
        answer = input.nextInt();
        if (answer == answerArray[6]) {
            System.out.println("Correct");
            count++;
        } else if (answer != 999) {
            System.out.println(" Wrong the answer was " + answerArray[6]);
        }
        System.out.println(quizArray[7]);
        answer = input.nextInt();
        if (answer == answerArray[7]) {
            System.out.println("Correct");
            count++;
        } else if (answer != 999) {
            System.out.println(" Wrong the answer was " + answerArray[7]);
        }
        else
        {
            break;
        }
        System.out.println(quizArray[8]);
        answer = input.nextInt();
        if (answer == answerArray[8]) {
            System.out.println("Correct");
            count++;
        } else if (answer != 999) {
            System.out.println(" Wrong the answer was " + answerArray[8]);
        }
        else
        {
            break;
        }
        System.out.println(quizArray[9]);
        answer = input.nextInt();
        if (answer == answerArray[9]) {
            System.out.println("Correct");
            count++;
        } else if (answer != 999) {
            System.out.println(" Wrong the answer was " + answerArray[9]);
        }
        else
        {
            break;
        }
}
    {
    System.out.println(" You got " + count + " answer(s) correct.");
}



    }
    public static void questions(String quizArray[])
    {
        quizArray[0] = " Which month only has 28 (29) days in it? \n 1 - October \n 2 - August \n 3 - February \n Answer >>  ";
        quizArray[1] = " 3 - 2 = ? \n Answer >>";
        quizArray[2] = " ((17 + (43 / 2)) * 0) + 2 = ? \n Answer >>";
        quizArray[3] = " I can't think of any more questions, good luck guessing. :)";
        quizArray[4] = " I' ll give you a hint, it's either 2 or 3.";
        quizArray[5] = " LOL get pranked kid, this one is fr between, 2 or 3.";
        quizArray[6] = " (3.4 * 4) / 13.6 = ?";
        quizArray[7] = " It's 2";
        quizArray[8] = " 1 + 2 = ";
        quizArray[9] = " Same answer as the second question.";
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
