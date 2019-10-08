package GameZone;

import java.util.Random;

public class FiveDiceModified {

    public static void main(String[] args)
    {
        Random rand = new Random();
        int [] dieRollsPlayer = new int[5];
        int [] dieRollsComputer = new int[5];
        int totalPlayer = 0;
        int totalComputer = 0;

        for(int i = 0; i < 5; i++)
        {
            int die = rand.nextInt( 6)+1;
//            System.out.println(die);
            totalPlayer = die + totalPlayer;
            dieRollsPlayer[i] = die;
            System.out.println(" You have rolled " + dieRollsPlayer[i]);
        }
        System.out.println(" For a total of " + totalPlayer);
        for(int i = 0; i < 5; i++)
        {
            int die = rand.nextInt( 6)+1;
//            System.out.println(die);
            totalComputer = die + totalComputer;
            dieRollsComputer[i] = die;
            System.out.println(" The Computer has rolled " + dieRollsComputer[i]);
        }
        System.out.println(" For a total of " + totalComputer);
//        System.out.println("The computer" + total);
        if (totalComputer > totalPlayer)
        {
            System.out.println(" The Computer wins!");
        }
        else if (totalPlayer > totalComputer)
        {
            System.out.println(" You win! ");
        }
        else
            {
                System.out.println(" It was a tie.");
            }
    }
}
