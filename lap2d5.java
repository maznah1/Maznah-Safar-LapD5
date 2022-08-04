package Package5;

import java.util.Random;
import java.util.Scanner;

public class lap2d5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        }
        else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");


    }

}
