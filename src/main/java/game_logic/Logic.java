package game_logic;

import field.Field;

public class Logic {

    public void printAlternatingXandO(int i) {
        if (i % 2 == 0) {
            System.out.println("Wo willst du ein X setzen?");
        } else {
            System.out.println("Wo willst du ein O setzen?");
        }
    }

    public String alternateXAndO(int i) {
        if (i % 2 == 0) {
            return "X";
        } else {
            return "O";
        }
    }

    public boolean solutionChecker(Field field) {
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
}
