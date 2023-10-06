package field;

public class Field {
  private String[] position = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

  private String grid =
      " "
          + position[7]
          + " | "
          + position[8]
          + " | "
          + position[9]
          + " \n"
          + "___________\n"
          + " "
          + position[4]
          + " | "
          + position[5]
          + " | "
          + position[6]
          + " \n"
          + "___________\n"
          + " "
          + position[1]
          + " | "
          + position[2]
          + " | "
          + position[3];

  private String getGrid() {
    return grid;
  }

  public void printGrid() {
    System.out.println(getGrid());
  }

  public void updateGrid() {
    grid =
        " "
            + position[7]
            + " | "
            + position[8]
            + " | "
            + position[9]
            + " \n"
            + "___________\n"
            + " "
            + position[4]
            + " | "
            + position[5]
            + " | "
            + position[6]
            + " \n"
            + "___________\n"
            + " "
            + position[1]
            + " | "
            + position[2]
            + " | "
            + position[3];
  }

  public String[] getPosition() {
    return position;
  }

  private String getPosition(int index) {
    return position[index];
  }

  public void setPosition(int index, String newValue) {
    //    do{
    //        if (getPosition(index).equals(newValue)){
    //            System.out.println("Probiers nochmal");
    //        }
    //    };
    position[index] = newValue;
  }
}
