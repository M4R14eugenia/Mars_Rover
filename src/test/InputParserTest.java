import RoversMovement.Directions;
import RoversMovement.Instructions;
import RoversMovement.Position;
import RoversMovement.Rover;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Parser.InputParser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class InputParserTest {

    @Test
    @DisplayName("Tests method return Position 3,2,N when passed String N")
    void testFirstPositionN() {
        // Arrange
        String userInput = "N";
        int inputX = 3;
        int inputY = 2;
        InputParser input = new InputParser();
        // Act
       Position result = input.firstPosition(inputX,inputY,userInput);
       Position position = new Position(3,2,Directions.N);

       // Assert
//        assertInstanceOf(Position.class,  result);
        assertEquals(position.getFacing(), result.getFacing());
    }

    @Test
    void rotate() {
    }

    @Test
    void move() {
    }
}