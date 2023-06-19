import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain)
        {
            //Get the user inputs
            System.out.println("Player 1, enter your either R/P/S: ");
            String player1 = in.nextLine();

            while(!player1.equals("R") && !player1.equals("S") && !player1.equals("P"))
            {
                System.out.println("Invalid entry. Please try again.");
                player1 = in.nextLine();
            }
                System.out.println("Player 2, enter either R/P/S: ");

            String player2 = in.nextLine();

            while(!player2.equals("R") && !player2.equals("S") && !player2.equals("P"))
            {
                System.out.println("Invalid entry. Please try again.");
                player2 = in.nextLine();
            }
                //Display user choices
                System.out.println("Player 1 chose " + player1);
                System.out.println("Player 2 chose " + player2);

            if (player1.equals(player2))
            {
                System.out.println("Its a tie!");
            }
            else if ((player1.equals("R") && player2.equals("S")) || (player1.equals("S") && player2.equals("P")) ||
                    (player1.equals("P") && player2.equals("R"))) {
                System.out.println("Player 1 wins!");
            }
            else
            {
                System.out.println("Player 2 wins!");
            }
            //Ask to play again
            System.out.println("Do you want to play again? Y or N: ");
            String playAgainChoice = in.nextLine();
            
            playAgain = playAgainChoice.equals("Y");
        }

    }

}

