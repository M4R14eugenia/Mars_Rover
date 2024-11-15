package RoversMovement;

public class Rover implements Movable{

    PlateauSize plateauSize;
    Position position;
    Directions direction;
    Instructions instructions;

    public Instructions getInstructions() {
        return instructions;
    }

    public Directions getDirection() {
        return direction;
    }

    public Position getPosition() {
        return position;
    }

    public PlateauSize getPlateauSize() {
        return plateauSize;
    }

    public Rover(Position position) {
        this.position = position;
    }

    @Override
    public void turnLeft(Instructions instructions) {
        //if position is
        //North - W; West - S; South - East; East - North
        if (instructions == Instructions.L) {
            if (position.getFacing() == Directions.N) {
                 position.setFacing(Directions.W);
            } else if (position.getFacing() == Directions.W) {
                position.setFacing(Directions.S);
            } else if (position.getFacing() == Directions.S) {
                position.setFacing(Directions.E);
            } else if (position.getFacing() == Directions.E) {
                position.setFacing(Directions.N);
            }
        }
    }
    public void turnRight(Instructions instructions) {
      //switch North - E; East - South; S- West; W -North;
        if(instructions == Instructions.R){
            if (position.getFacing() == Directions.N) {
                position.setFacing(Directions.E);
            } else if (position.getFacing() == Directions.W) {
                position.setFacing(Directions.N);
            }else if (position.getFacing() == Directions.S){
                position.setFacing(Directions.W);
            }else if (position.getFacing() == Directions.E){
                position.setFacing(Directions.S);
            }
        }
    }

    @Override
    public Position move(Instructions instructions) {
        //if "M"
        //get position
        //if facing North = y+1; if facing South y-1; if facing east x-1; if facing west x+1
        if(instructions == Instructions.M){
            if(position.getFacing() == Directions.N){
                position.setY(position.getY() + 1);
            }
            else if(position.getFacing() == Directions.S){
                position.setY(position.getY() - 1);
            }
            else if (position.getFacing() == Directions.E){
                position.setX(position.getX() +1);
            } else if (position.getFacing() == Directions.W) {
                position.setX(position.getX()-1);

            }

        }
        return null;
    }
}
