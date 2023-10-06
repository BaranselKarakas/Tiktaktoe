import field.Field;
import logic.Logic;

import java.util.Scanner;

public class Game {

    Scanner myScanner = new Scanner(System.in);

    Field field = new Field();

    Logic logic = new Logic();

    void startGame() {
        field.printGrid();
        for (int i = 0; i <= 8; i++) {
            int input;
            do {
                logic.printAlternatingXandO(i);
                input = myScanner.nextInt();
                if (input < 1 || input > 9) {
                    System.out.println("Probiers nochmal");
                }
            } while (input < 1 || input > 9);
            field.setPosition(input, logic.alternateXAndO(i));
            field.updateGrid();
            if (logic.solutionChecker(field)) {
                break;
            }
            field.printGrid();
        }
    }
}
