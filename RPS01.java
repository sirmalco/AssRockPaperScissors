import java.util.Scanner;

public class RPS01
{
    public static void main(String[] args)
    {
        String player1;
        String player2;
        boolean play = true;
        Scanner in = new Scanner(System.in);
        while(play)
        {
            System.out.println("Player 1 enter move(R, P, or S)");
            player1=in.nextLine();
            System.out.println("Player 2 enter move(R, P, or S)");
            player2=in.nextLine();

            if(player1.equals("R") && player2.equals("P"))
            {
                System.out.println("Player 2 wins!");
            }
            else if(player1.equals("P") && player1.equals("S"))
            {
                System.out.println("Player 2 wins!");
            }
            else if(player1.equals("S") && player2.equals("R"))
            {
                System.out.println("Player 2 wins!");
            }
            else if(player1.equals(player2))
            {
                System.out.println("Tie!");
            }
            else
            {
                System.out.println("Player 1 wins!");
            }


            System.out.println("Do you want to play again? (true or false)");
            play = in.nextBoolean();
            in.nextLine();
        }

    }
}
