import field.Field;
import output.Printer;

import java.util.Scanner;

public class Tiktaktoe {
    Field field = new Field();
    Printer printer = new Printer();
    Scanner myScanner = new Scanner(System.in);

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
        printer.printField(field);
        for (int i = 0; i <= 8; i++) {
            printAlternatingXandO(i);
            int input = myScanner.nextInt();
            field.setPosition(input, AlternateXAndO(i));
            field.printPosition();
            printer.printField(field);
        }
    }
}
