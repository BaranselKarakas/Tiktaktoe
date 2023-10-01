import field.Field;
import game_logic.Logic;

import java.util.Scanner;

public class Game {

    Scanner myScanner = new Scanner(System.in);

    Field field = new Field();

    Logic logic = new Logic();

    void startGame() {
        field.printGrid();
        for (int i = 0; i <= 8; i++) {
            logic.printAlternatingXandO(i);
            int input = myScanner.nextInt();
            field.setPosition(input, logic.alternateXAndO(i));
            field.updateGrid();
            if (logic.solutionChecker(field)) {  //warum läuft das durch, ist das nicht nur eine Abfrage?
                break;
            }
            field.printGrid();
        }
    }
}
