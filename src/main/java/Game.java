import field.Field;
import java.util.Scanner;
import logic.Logic;

public class Game {

  Scanner myScanner = new Scanner(System.in);

  Field field = new Field();

  Logic logic = new Logic();

  void startGame() {
    field.printGrid();
    for (int i = 0; i <= 8; i++) {
      int input = logic.validateInputFromUser(myScanner, i);
      field.setPosition(input, logic.alternateXAndO(i));
      field.updateGrid();
      if (logic.solutionChecker(field)) {
        break;
      }
      field.printGrid();
    }
    System.out.println("Untentschieden!");
  }
}
