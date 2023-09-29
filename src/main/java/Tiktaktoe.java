import field.Field;
import output.Printer;

import java.util.Scanner;

public class Tiktaktoe {
    Field field = new Field();
    Printer printer = new Printer();
    Scanner myScanner = new Scanner(System.in);

    void startGame() {
        printer.printField(field);
        System.out.println("Wo willst du ein X setzen?");
        int befehl1 = myScanner.nextInt();
        field.replaceCharacter(befehl1, "X");
        printer.printField(field);
        System.out.println("Wo willst du ein O setzen?");
        int befehl2 = myScanner.nextInt();
        befehl2 = myScanner.nextInt();
        System.out.println("Wo willst du ein X setzen?");
        int befehl3 = myScanner.nextInt();
        befehl3 = myScanner.nextInt();
        System.out.println("Wo willst du ein O setzen?");
        int befehl4 = myScanner.nextInt();
        befehl4 = myScanner.nextInt();
        System.out.println("Wo willst du ein X setzen?");
        int befehl5 = myScanner.nextInt();
        befehl5 = myScanner.nextInt();
        System.out.println("Wo willst du ein O setzen?");
        int befehl6 = myScanner.nextInt();
        befehl6 = myScanner.nextInt();
    }
}
