import Parser.InputParser;
import RoversMovement.PlateauSize;
import RoversMovement.Position;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class User {
    InputParser inputParser;
    int x;
    int y;
    int a;
    int b;
    String direction;


    public void plateauSizeInput() {

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

                if (x > 9 || y > 9 || x < 0 || y < 0) {
                    System.out.println("Please choose a single number from 0 to 9");
                }

            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
            break;
        }
    }

    public void landRover() {
        Scanner scanner;
        while (true) {


            try {
                scanner = new Scanner(System.in);
                System.out.println("Now let's land your Rover in the Plateau. Please choose a number to be your first coordinate position, x");
                a = scanner.nextInt();

                if (a > PlateauSize.getX() || a < 0) {
                    System.out.println("Coordinate out of bounds for Plateau size. Please choose a valid number. The Plateau size is" + PlateauSize.getX() + ", " + PlateauSize.getY());
                    continue;
                }

                System.out.println("Now, choose another number to be your second coordinate position, y");
                b = scanner.nextInt();

                if (b > PlateauSize.getY() || b < 0) {
                    System.out.println("Coordinate out of bounds for Plateau size. Please choose a valid number. The Plateau size is " + PlateauSize.getX() + ", " + PlateauSize.getY());
                    System.out.println("Let's try again.");
                    continue;
                }

                System.out.println(" Please choose a direction you wish your Rover to be facing = N, E, S, W ");
                scanner.nextLine();
                direction = scanner.nextLine().toUpperCase();

                if (!direction.matches(" [a-zA-Z]{1}")) {
                    System.out.println("This is not a valid direction, please type N for North, E for East, S for South or W for West.");
                }


                inputParser.firstPosition(a, b, direction);
                System.out.println("your Rover landed successfully at the coordinates " + inputParser.firstPosition(a, b, direction));
            } catch (MatchException e) {
                e.printStackTrace();
            }

        }
    }
}



