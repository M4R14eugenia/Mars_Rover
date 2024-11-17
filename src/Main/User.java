import Parser.InputParser;
import RoversMovement.PlateauSize;
import RoversMovement.Position;
import RoversMovement.Rover;

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
    String commands;


    public void plateauSizeInput() {

        Scanner scanner;
        x = 0;
        y = 0;
        while (true) {
            try {
                scanner = new Scanner(System.in);

                System.out.println("Let's set the Plateau size. Please choose a number, from 2 to 30 to be your number of columns");
                x = scanner.nextInt();
                if (x < 2){
                    System.out.println("this is too small a plateau, your Rover will not have space to land or move.");
                    continue;
                }
                if(x> 30){
                    System.out.println("This number is passed the limit size, please try again with a number from 2-30");
                    continue;
                }

                System.out.println("Please choose another number to be your number of rows");
                y = scanner.nextInt();
                if (y < 2){
                    System.out.println("this is too small a plateau, your Rover will not have space to land or move.");
                    continue;
                }
                if(y > 30){
                    System.out.println("This number is passed the limit size, please try again with a number from 2-30");
                    continue;
                }

                PlateauSize.setY(y);
                PlateauSize.setX(x);
                PlateauSize.plateauGrid(new PlateauSize(x, y));



            } catch (InputMismatchException e) {
                System.out.println("This is not a valid number, please try again with a number");
                continue;
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
                    System.out.println("Coordinate out of bounds for Plateau size. Please choose a valid number. The Plateau size is " + PlateauSize.getX() + ", " + PlateauSize.getY());
                    continue;
                }

                System.out.println("Now, choose another number to be your second coordinate position, y");
                b = scanner.nextInt();

                if (b > PlateauSize.getY() || b < 0) {
                    System.out.println("Coordinate out of bounds for Plateau size. Please choose a valid number. The Plateau size is " + PlateauSize.getX() + ", " + PlateauSize.getY());
                    System.out.println("Let's try again.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again with a number");
                continue;
            }
          try {
              System.out.println(" Please choose a direction you wish your Rover to be facing = N, E, S, W ");
              scanner.nextLine();
              direction = scanner.nextLine();

              if (direction.equals("N") || direction.equalsIgnoreCase( "E") || direction.equalsIgnoreCase( "S") || direction.equalsIgnoreCase( "W")) {

                  InputParser.firstPosition(a, b, direction);}
              else {
                  System.out.println("This is not a valid direction, please type N for North, E for East, S for South or W for West.");
                  continue;
              }

          }catch (Exception e){
              System.out.println(e.getMessage());
              continue;
          }


        break;
        }
    }

    public void moveRover() {
        Scanner scanner;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.println("Now, let's get this Rover moving!");
                System.out.println("To move your rover, please give commands following this basic instructions. Type L to turn Left, R to turn right and M to move your rover.");
                System.out.println("Please type your instructions : 'e.g. MMLMRM'");
                commands = scanner.nextLine();
                for (int i = 0; i < commands.length(); i++) {

                    if (commands.charAt(i).equalsIgnoreCase("M") || commands.equalsIgnoreCase("L") || commands.equalsIgnoreCase("R")) {

                        inputParser.move(commands, new Rover(InputParser.firstPosition(a, b, direction)));
                    }
                }else{
                    System.out.println("invalid input, please try again using: L to turn left, R to turn right and M to move");
                    continue;
                }
            }

                } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;            }
            break;
        }
    }
}


