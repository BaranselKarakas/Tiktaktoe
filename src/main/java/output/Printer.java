package output;

import field.Field;

public class Printer {

    Field field = new Field();

    public void printField() {
        System.out.println(field.getGrid());
    }
}
