package field;

import java.util.Arrays;
import java.util.Scanner;

public class Field {
    String[] position = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String grid =
            " " + position[7] + " | " + position[8] + " | " + position[9] + " \n" +
                    "___________\n" +
                    " " + position[4] + " | " + position[5] + " | " + position[6] + " \n" +
                    "___________\n" +
                    " " + position[1] + " | " + position[2] + " | " + position[3];
    Scanner myObj = new Scanner(System.in);

    public String getGrid() {
        return grid;
    }

    public void printPosition() {
        System.out.println(Arrays.toString(position));
    }

    public void setPosition(int index, String newValue) {
        position[index] = newValue;
    }
}
