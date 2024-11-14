package RoversMovement;

public class Rover implements Movable{

    PlateauSize plateauSize;
    Position position;
    Directions direction;
    Instructions instructions;

    public Rover(Position position) {
        this.position = position;
    }

    @Override
    public Directions turnRight(Instructions instructions, Position position) {
        //if position is
         //North - W; West - S; South - East; East - North


        return null;}
    public Directions turnLeft(Instructions instructions, Position position) {
      //switch North - E; East - South; S- West; W -North;

        return null;}

    @Override
    public Directions move(Instructions instructions, Position position) {
        //if "M"
        //get position
        //if facing North = y+1; if facing South y-1; if facing east x-1; if facing west x+1

        return null;
    }
}
