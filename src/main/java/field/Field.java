package field;

import java.util.Scanner;

public class Field {
    String grid = """
             7 | 8 | 9 
            ___________
             4 | 5 | 6 
            ___________
             1 | 2 | 3 """;
    Scanner myObj = new Scanner(System.in);

    public String getGrid() {
        return grid;
    }

    public void replaceCharacter(int oldChar, String newChar) {
        grid = grid.replace(String.valueOf(oldChar), newChar);
    }
}
