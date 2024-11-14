package RoversMovement;

public interface Movable {

    public Directions turnRight(Instructions instructions, Position position);
    public Directions turnLeft(Instructions instructions, Position position);
    public Directions move(Instructions instructions, Position position);
}
