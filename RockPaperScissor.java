package Game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter : 0 for Rock, 1 for Paper, 2 for Scissor");
        int yourChoice = input.nextInt();

        Random random = new Random();
        int compChoice = random.nextInt(3);

        if(yourChoice == 0)
            System.out.println("You choose : Rock");
        else if(yourChoice == 1)
            System.out.println("You choose : Paper");
        else System.out.println("You choose : Scissor");

        if(compChoice == 0)
            System.out.println("Computer choose : Rock");
        else if(compChoice == 1)
            System.out.println("Computer choose : Paper");
        else System.out.println("Computer choose : Scissor");

        if(yourChoice == compChoice)
            System.out.println("Match Draw!");
        else if ((yourChoice == 0 && compChoice == 2) || (yourChoice == 1 && compChoice == 0)
                || (yourChoice == 2 && compChoice == 1)) {
            System.out.println("Wow, You Win!");
        }
        else System.out.println("Computer Win!, Better luck next time.");

    }
}
