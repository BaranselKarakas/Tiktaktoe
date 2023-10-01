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

    String alternateXAndO(int i) {
        if (i % 2 == 0) {
            return "X";
        } else {
            return "O";
        }
    }

    boolean solutionChecker(Field field) {
        String[] positionList = field.getPosition();
        if (positionList[1].equals("X") && (positionList[2].equals("X")) && (positionList[3]).equals("X") ||
                positionList[4].equals("X") && (positionList[5].equals("X")) && (positionList[6]).equals("X") ||
                positionList[7].equals("X") && (positionList[8].equals("X")) && (positionList[9]).equals("X") ||
                positionList[1].equals("X") && (positionList[4].equals("X")) && (positionList[7]).equals("X") ||
                positionList[2].equals("X") && (positionList[5].equals("X")) && (positionList[8]).equals("X") ||
                positionList[3].equals("X") && (positionList[6].equals("X")) && (positionList[9]).equals("X") ||
                positionList[1].equals("X") && (positionList[5].equals("X")) && (positionList[7]).equals("X") ||
                positionList[3].equals("X") && (positionList[5].equals("X")) && (positionList[9]).equals("X")
        ) {
            System.out.println("X hat gewonnen");
            return true;
        }
        if (positionList[1].equals("O") && (positionList[2].equals("O")) && (positionList[3]).equals("O") ||
                positionList[4].equals("O") && (positionList[5].equals("O")) && (positionList[6]).equals("O") ||
                positionList[7].equals("O") && (positionList[8].equals("O")) && (positionList[9]).equals("O") ||
                positionList[1].equals("O") && (positionList[4].equals("O")) && (positionList[7]).equals("O") ||
                positionList[2].equals("O") && (positionList[5].equals("O")) && (positionList[8]).equals("O") ||
                positionList[3].equals("O") && (positionList[6].equals("O")) && (positionList[9]).equals("O") ||
                positionList[1].equals("O") && (positionList[5].equals("O")) && (positionList[7]).equals("O") ||
                positionList[3].equals("O") && (positionList[5].equals("O")) && (positionList[9]).equals("O")
        ) {
            System.out.println("O hat gewonnen");
            return true;
        } else {
            return false;
        }
    }

    void startGame() {
        field.printGrid();
        for (int i = 0; i <= 8; i++) {
            printAlternatingXandO(i);
            int input = myScanner.nextInt();
            field.setPosition(input, alternateXAndO(i));
            field.updateGrid();
            if (solutionChecker(field)) {  //warum läuft das durch, ist das nicht nur eine Abfrage?
                break;
            }
            field.printGrid();
        }
    }
}
