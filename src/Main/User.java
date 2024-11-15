import Parser.InputParser;
import RoversMovement.PlateauSize;
import RoversMovement.Position;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    InputParser inputParser;
    int x;
    int y;
    char direction;
    public void firstInput() {
        Scanner scanner;
        while (true) {
            try {
                scanner = new Scanner(System.in);

                System.out.println("Let's set the Plateau size. Please choose a number, from 0 to 9, to be your number of columns");
                x = scanner.nextInt();

                System.out.println("Please choose another number, from 0 to 9, to be your number of rows");
                y = scanner.nextInt();

                PlateauSize.setY(y);
                PlateauSize.setX(x);
                PlateauSize.plateauGrid(new PlateauSize(x, y));

                if (x > 9 || y > 0 || x < 0 || y < 0) {
                    System.out.println("Please choose a single number from 0 to 9");
                    continue;
                }

            } catch (InputMismatchException e) {
            e.printStackTrace();
            continue;
            }
            break;

        }
        scanner.close();
    }

    public void secondInput() {
        Scanner scanner;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("Now let's land your Rover in the Plateau. Please choose a number to be your first coordinate position, x");
                x = scanner.nextInt();
                System.out.println("Now, choose another number to be your second coordinate position, y");
                y = scanner.nextInt();

                if (x > PlateauSize.getX() || y > PlateauSize.getY() || x < PlateauSize.getX() || y < PlateauSize.getY()) {
                    System.out.println("Coordinate out of bounds for Plateau size. Please choose a valid number. The Plateau size is " + PlateauSize.getX() + ", " + PlateauSize.getY());
                }

            } catch (MatchException e) {
                e.printStackTrace();
            }
           try{
               scanner = new Scanner(System.in);
               System.out.println(" Please choose a direction you wish your Rover to be facing = N, E, S, W ");
               scanner.nextLine();
               direction = scanner.nextLine().charAt(0);
           } catch (InputMismatchException e){
               e.printStackTrace();
           }
           inputParser.firstPosition(x,y, String.valueOf(direction));
        }
    }
}


