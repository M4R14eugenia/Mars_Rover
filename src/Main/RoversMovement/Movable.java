package RoversMovement;

public interface Movable {

    public Directions rotate (Instructions instructions, Position position);
    public Directions move(Instructions instructions, Position position);
}
