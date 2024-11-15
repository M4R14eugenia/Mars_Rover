import RoversMovement.PlateauSize;

import java.util.Scanner;

public class User {
    String inputDirection;
    String inputCommands;
    int x;
    int y;

    public void setPlateauSize(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's set the Plateau size. Please choose a number from 0 - 9 to be your number or rows");
        x = scanner.nextInt();
        PlateauSize.setX(x);
        System.out.println("Please choose another number from 0 - 9 to be your number or columns");
        y = scanner.nextInt();
        PlateauSize.setY(y);
    }

}
