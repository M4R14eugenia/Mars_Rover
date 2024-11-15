package RoversMovement;

import Parser.InputParser;

public class PlateauSize {
    private static int x = 0;
    private static int y = 0;
    Position firstPosition;

    public PlateauSize(int y, int x) {
        PlateauSize.y = y;
        PlateauSize.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        PlateauSize.y = y;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        PlateauSize.x = x;
    }

    public Position getFirstPosition() {
        return firstPosition;
    }

    public void setFirstPosition(Position firstPosition) {
        this.firstPosition = firstPosition;
    }


    public static void plateauGrid (PlateauSize plateauSize){

     int [][] plateau = new int[plateauSize.getX()][plateauSize.getY()];

            for (int[] row : plateau){
                String newRoll = " ";
                for (int columns : row){
                    newRoll += columns;
                    newRoll += "";
                }

                System.out.println(newRoll);}
        }
    }

