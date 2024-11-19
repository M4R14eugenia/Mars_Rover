import RoversMovement.Directions;
import RoversMovement.Instructions;
import RoversMovement.Position;
import RoversMovement.Rover;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Parser.InputParser;

import static java.lang.String.valueOf;
import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    @DisplayName("Tests method return Position 3,2,N when passed String N")
    void testFirstPositionN() {
        // Arrange
        String userInput = "N";
        int inputX = 3;
        int inputY = 2;
        // Act
       Position result = InputParser.firstPosition(inputX,inputY,userInput);
       Position position = new Position(3,2,Directions.N);

       // Assert
//        assertInstanceOf(Position.class,  result);
        assertEquals(position.getFacing(), result.getFacing());
    }
    @Test
    @DisplayName("Tests method return Position facing in the same direction as passed String")
    void testFirstPosition() {
        // Arrange
        String userInput = "N";
        String userInputOne = "E";
        String userInputTwo = "S";
        String userInputThree = "W";

        int inputX = 3;
        int inputY = 2;

        // Act
        Position result = InputParser.firstPosition(inputX,inputY,userInput);
        Position resultOne = InputParser.firstPosition(inputX,inputY,userInputOne);
        Position resultTwo = InputParser.firstPosition(inputX,inputY,userInputTwo);
        Position resultThree = InputParser.firstPosition(inputX,inputY,userInputThree);

        Position position = new Position(3,2,Directions.N);
        Position positionOne = new Position(3,2,Directions.E);
        Position positionTwo = new Position(3,2,Directions.S);
        Position positionThree = new Position(3,2,Directions.W);


        // Assert
//        assertInstanceOf(Position.class,  result);
        assertEquals(position.getFacing(), result.getFacing());
        assertEquals(positionOne.getFacing(), resultOne.getFacing());
        assertEquals(positionTwo.getFacing(), resultTwo.getFacing());
        assertEquals(positionThree.getFacing(), resultThree.getFacing());

    }

    @Test
    @DisplayName("Tests rover can turn right given String input R")
    void testRotateRight() {
        Position position = InputParser.firstPosition(3,2,"N");

        String input = "R";
        Rover rover = new Rover(position);
        //Act
        InputParser.move(input, rover);
        //Assert
        assertEquals(Directions.E, position.getFacing());
    }
    @Test
    @DisplayName("Tests rover can turn left given String input L")
    void testRotateLeft() {
        Position position = InputParser.firstPosition(3,2,"N");

        String input = "L";
        Rover rover = new Rover(position);
        //Act
        InputParser.move(input, rover);
        //Assert
        assertEquals(Directions.W, position.getFacing());
    }
    @Test
    @DisplayName("Test rover moves North, when facing , given String input M")
    void testMoveNorth() {
        //Assert
        Rover rover = new Rover(new Position(3, 2, Directions.N));
        String userInput = "M";
       //Act
        InputParser.move(userInput,rover);
        //Assert
        assertEquals(3, rover.getPosition().getY());
    }
    @Test
    @DisplayName("Test rover in all directions given String input M")
    void testMove() {
        //Assert
        Rover rover = new Rover(new Position(3, 2, Directions.N));
        Rover roverOne = new Rover(new Position(3, 2, Directions.E));
        Rover roverTwo = new Rover(new Position(3, 2, Directions.W));
        Rover roverThree = new Rover(new Position(3, 2, Directions.S));

        String userInput = "M";
        //Act
        InputParser.move(userInput,rover);
        InputParser.move(userInput,roverOne);
        InputParser.move(userInput,roverTwo);
        InputParser.move(userInput,roverThree);

        //Assert
        assertEquals(3, rover.getPosition().getY());
        assertEquals(4, roverOne.getPosition().getX());
        assertEquals(2, roverTwo.getPosition().getX());
        assertEquals(1, roverThree.getPosition().getY());

    }
    @Test
    @DisplayName("Test rover moves in all directions given long String input")
    void testLongMove() {
        //Assert
        Rover rover = new Rover(new Position(3, 3, Directions.E));


        String userInput = "MMRMMRMRRM";
        //Act
        InputParser.move(userInput,rover);


        //Assert
        assertEquals(5, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Directions.E, rover.getPosition().getFacing());


    }
}