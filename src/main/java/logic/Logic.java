package logic;

import field.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Logic {

  private ArrayList<Integer> list = new ArrayList<>();
  private int input = 0;

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

  private void checkNumberbetween1and9(Scanner myScanner, int i) {
    do {
      printAlternatingXandO(i);
      input = myScanner.nextInt();
      if (input < 1 || input > 9) {
        System.out.println("Probiers nochmal");
      }
    } while (input < 1 || input > 9);
  }

  public int validateInputFromUser(Scanner myScanner, int i) {
    do {
      checkNumberbetween1and9(myScanner, i);
      if (list.contains(input)) {
        System.out.println("Probiers nochmal");
      }
    } while (list.contains(input));
    list.add(input);
    return input;
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
          System.out.println("X hat gewonnen!");
          return true;
        case "OOO":
          System.out.println("O hat gewonnen!");
          return true;
      }

    return false;
  }
}
