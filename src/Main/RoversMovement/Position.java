package RoversMovement;

public class Position {
    private int x;
    private int y;
    private Directions facing;
    Position position;
    Rover rover;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Directions getFacing() {
        return facing;
    }

    public void setFacing(Directions facing) {
        this.facing = facing;
    }

    public Position(int x, int y, Directions facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }
    public boolean isValidPosition (){
        if(position != null){
            if (position.getX() > PlateauSize.getX() || position.getY() > PlateauSize.getY()){
            return false;}
        }
    return true;}
}
