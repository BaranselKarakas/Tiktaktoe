import field.Field;

import java.util.Scanner;

public class Game {

    Scanner myScanner = new Scanner(System.in);

    Field field = new Field();

    void printAlternatingXandO(int i) {
        if (i % 2 == 0) {
            System.out.println("Wo willst du ein X setzen?");
        } else {
            System.out.println("Wo willst du ein O setzen?");
        }
    }

    String AlternateXAndO(int i) {
        if (i % 2 == 0) {
            return "X";
        } else {
            return "O";
        }
    }

    void SolutionChecker(String field) {

    }

    void startGame() {
        field.printGrid();
        for (int i = 0; i <= 8; i++) {
            printAlternatingXandO(i);
            int input = myScanner.nextInt();
            field.setPosition(input, AlternateXAndO(i));
            field.printPosition();
            field.printGrid();
        }
    }
}
