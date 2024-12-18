package Parser;

import RoversMovement.*;


public class InputParser {
    static RoversMovement.Instructions instructions;
    static Position position;

    public static Position firstPosition(int x, int y, String userInput) {
        if (userInput.equalsIgnoreCase("N")) {
            position = new Position(x, y, Directions.N);
        } else if (userInput.equalsIgnoreCase("E")) {
            position = new Position(x, y, Directions.E);
        } else if (userInput.equalsIgnoreCase("S")) {
            position = new Position(x, y, Directions.S);
        } else if (userInput.equalsIgnoreCase("W")) {
            position = new Position(x, y, Directions.W);
        }
        System.out.println("Your Rover landed in Mars successfully, at the coordenates " + position.getX()+ ", " + position.getY() +" " +position.getFacing());
        return position;
    }




    public static Position move(String userInput, Rover rover) {


        for (int i = 0; i < userInput.length(); i++) {

            if(userInput.charAt(i) != 'M' && userInput.charAt(i) != 'R' && userInput.charAt(i) != 'L'){
                System.out.println("Rover cannot move, invalid input");
            }

            if (userInput.charAt(i) == 'L') {
                instructions = Instructions.L;
                rover.turnLeft(Instructions.L);
            } else if (userInput.charAt(i) == 'R') {
                instructions = Instructions.R;
                rover.turnRight(Instructions.R);
            }

        if (userInput.charAt(i) == 'M') {
            System.out.println("Rover moving from " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing()+"...");

            if (rover.getPosition().getFacing() == Directions.N) {
                rover.move(Instructions.M);
                System.out.println("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing()+ "\n");
            }
            if (rover.getPosition().getFacing() == Directions.E) {
                rover.move(Instructions.M);
                System.out.println("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing()+ "\n");

            }
            if (rover.getPosition().getFacing() == Directions.W) {
                rover.move(Instructions.M);
                System.out.println("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing()+"\n");

            }
            if (rover.getPosition().getFacing() == Directions.S) {
                rover.move(Instructions.M);
                System.out.print("... to " + rover.getPosition().getX() + "," + rover.getPosition().getY() + "," + rover.getPosition().getFacing()+"\n");

            }
        }}
        return rover.getPosition();
    }
}



