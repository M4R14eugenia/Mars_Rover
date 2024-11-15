package Parser;

import RoversMovement.*;

import java.lang.Enum.EnumDesc;
import java.util.Objects;


public class InputParser {
    RoversMovement.Directions direction;
    RoversMovement.Instructions instructions;
    Position position;
    String userInput;


   public void plateauSetSize(int x, int y){
   }

    public Position firstPosition(int x, int y, String userInput) {
        if (userInput.equals("N")) {
            position = new Position(x, y, Directions.N);
        } else if (userInput.equals("E")) {
            position = new Position(x, y, Directions.E);
        } else if (userInput.equals("S")) {
            position = new Position(x, y, Directions.S);
        } else if (userInput.equals("W")) {
            position = new Position(x, y, Directions.E);
        }
        return position;
    }

    public void rotate(String userInput, Rover rover, Position position) {

        if (userInput.equals("L")) {
            instructions = Instructions.L;
            rover.turnLeft(Instructions.L);
        } else if (userInput.equals("R")) {
            instructions = Instructions.R;
            rover.turnRight(Instructions.R);
        }
    }

    public void move(String userInput, Rover rover, Position facing) {
        if (userInput.equals("M")) {
            System.out.println("Rover moving from " + facing.getX() + "," + facing.getY() + "," + facing.getFacing());

            if (facing.getFacing() == Directions.N) {
                rover.move(instructions);
                System.out.print(" to" + facing.getX() + "," + facing.getY() + "," + facing.getFacing());
            }
            if (facing.getFacing() == Directions.E) {
                rover.move(instructions);
                System.out.print(" to" + facing.getX() + "," + facing.getY() + "," + facing.getFacing());

            }
            if (facing.getFacing() == Directions.W) {
                rover.move(instructions);
                System.out.print(" to" + facing.getX() + "," + facing.getY() + "," + facing.getFacing());

            }
            if (facing.getFacing() == Directions.S) {
                rover.move(instructions);
                System.out.print(" to" + facing.getX() + "," + facing.getY() + "," + facing.getFacing());

            }
        }
    }
}



