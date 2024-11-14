package RoversMovement;

public class PlateauSize {


    public static void plateauGrid (){

        String [][][] plateauSize = new String[5][5][2];
        for (int i = 0; i < plateauSize.length; i++) {
            for (int j = 0; j < plateauSize.length; j++) {
                for (int k = 0; k < plateauSize[j].length; k++) {
                        plateauSize[i][j][0] = "x";
                        plateauSize[i][j][1] = "y";
                }}}
            for (String[][] string : plateauSize){
                String newRoll = " ";
                for (String[] columns : string){
                    for (String el : columns){
                    newRoll += el;
                    newRoll += "";
                }}

                System.out.println(newRoll);}
        }
    }

