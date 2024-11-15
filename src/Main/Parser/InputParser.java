package Parser;

import RoversMovement.*;

import java.lang.Enum.EnumDesc;
import java.util.Objects;


public class InputParser {
    RoversMovement.Instructions instructions;
    Position position;



    public Position firstPosition(int x, int y, String userInput) {
        if (userInput.equals("N")) {
            position = new Position(x, y, Directions.N);
        } else if (userInput.equals("E")) {
            position = new Position(x, y, Directions.E);
        } else if (userInput.equals("S")) {
            position = new Position(x, y, Directions.S);
        } else if (userInput.equals("W")) {
            position = new Position(x, y, Directions.W);
        }
        return position;
    }

    public void rotate(String userInput, Rover rover) {

        if (userInput.equals("L")) {
            instructions = Instructions.L;
            rover.turnLeft(Instructions.L);
        } else if (userInput.equals("R")) {
            instructions = Instructions.R;
            rover.turnRight(Instructions.R);
        }

    }

    public void move(String userInput, Rover rover) {
        if (userInput.equals("M")) {
            System.out.println("Rover moving from " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing()+"...");

            if (rover.getPosition().getFacing() == Directions.N) {
                rover.move(Instructions.M);
                System.out.println("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing());
            }
            if (rover.getPosition().getFacing() == Directions.E) {
                rover.move(Instructions.M);
                System.out.println("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing());

            }
            if (rover.getPosition().getFacing() == Directions.W) {
                rover.move(Instructions.M);
                System.out.println("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing());

            }
            if (rover.getPosition().getFacing() == Directions.S) {
                rover.move(Instructions.M);
                System.out.print("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing());

            }
        }
    }
}



