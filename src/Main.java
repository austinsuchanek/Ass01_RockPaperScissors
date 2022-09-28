import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        while (true) {

            String play1;
            String play2;

            while (true) {
                System.out.println("Player 1, enter your move! (r, p, or s)");
                play1 = in.nextLine();
                if (play1.equalsIgnoreCase("r") || play1.equalsIgnoreCase("p") || play1.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println(play1 + " is not a valid move!");
            }

            while (true) {
                System.out.println("Player 2, enter your move! (r, p, or s)");
                play2 = in.nextLine();
                if (play2.equalsIgnoreCase("r") || play2.equalsIgnoreCase("p") || play2.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println(play1 + " is not a valid move!");
            }

            if (play1.equalsIgnoreCase(play2)) {
                System.out.println(play1 + " vs " + play2 + " it's a tie!");
            } else if (play2.equalsIgnoreCase("r")) {
                if (play1.equalsIgnoreCase("p")) {
                    System.out.println("Paper covers rock! Player 2 Wins!");
                } else if (play1.equalsIgnoreCase("s")) {
                    System.out.println("Rock breaks scissors! Player 2 Wins");
                }
            } else if (play2.equalsIgnoreCase("p")) {
                if (play1.equalsIgnoreCase("r")) {
                    System.out.println("Paper covers rock! Player 2 Wins!");
                } else if (play1.equalsIgnoreCase("s")) {
                    System.out.println("Scissors cuts paper! Player 1 Wins");
                }
            } else if (play2.equalsIgnoreCase("s")) {
                if (play1.equalsIgnoreCase("p")) {
                    System.out.println("Scissors cuts paper! Player 2 Wins");
                } else if (play1.equalsIgnoreCase("r")) {
                    System.out.println("Rock breaks scissors! Player 1 wins");
                }
            }

            System.out.println("Do you want to play again? Enter y (for yes) or n (for no): ");
            String playAgain = in.nextLine();
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }

        }
    }

}
