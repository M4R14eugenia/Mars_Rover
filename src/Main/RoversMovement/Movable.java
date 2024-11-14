package RoversMovement;

public interface Movable {

    void turnRight(Instructions instructions);
    void turnLeft(Instructions instructions);
    Position move(Instructions instructions);
}
