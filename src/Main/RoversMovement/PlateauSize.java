package RoversMovement;

public class PlateauSize {
    int x = 0;
    int y = 0;

    public PlateauSize(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static void plateauGrid (int x, int y){

     int [][] plateau = new int[x][y];

            for (int[] row : plateau){
                String newRoll = " ";
                for (int columns : row){
                    newRoll += columns;
                    newRoll += "";
                }

                System.out.println(newRoll);}
        }
    }

