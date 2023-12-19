package snakeandladdergame;

import java.util.Random;

public class SnakeAndLadderGame {

    public static int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static String checkOption() {
        Random random = new Random();
        int optionNumber = random.nextInt(3);

        switch (optionNumber) {
            case 0:
                return "No Play";
            case 1:
                return "Ladder";
            case 2:
                return "Snake";
            default:
                return "No Play";
        }
    }

    public static void playSinglePlayerGame() {
        int position = 0;
        int diceRolls = 0;

        while (position < 100) {
            int dice = rollDie();
            String option = checkOption();

            if (option.equals("No Play")) {
                // Do nothing, stay in the same position
            } else if (option.equals("Ladder")) {
                if (position + dice <= 100) {
                    position += dice;
                }
            } else if (option.equals("Snake")) {
                position = Math.max(0, position - 3);
            }

            diceRolls++;
            System.out.println("Position after dice roll " + diceRolls + ": " + position);
        }

        System.out.println("Player wins after " + diceRolls + " dice rolls!");
    }

    public static void main(String[] args) {
        System.out.println("Single Player Game:");
        playSinglePlayerGame();
    }
}
