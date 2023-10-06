package logic;

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
    String[] winLines = {
      positionList[1] + positionList[2] + positionList[3],
      positionList[4] + positionList[5] + positionList[6],
      positionList[7] + positionList[8] + positionList[9],
      positionList[1] + positionList[4] + positionList[7],
      positionList[2] + positionList[5] + positionList[8],
      positionList[3] + positionList[6] + positionList[9],
      positionList[1] + positionList[5] + positionList[9],
      positionList[3] + positionList[5] + positionList[7]
    };

    for (String line : winLines)
      switch (line) {
        case "XXX":
          System.out.println("X hat gewonnen");
          return true;
        case "OOO":
          System.out.println("O hat gewonnen");
          return true;
      }

    return false;
  }
}
