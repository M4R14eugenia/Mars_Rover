import RoversMovement.Directions;
import RoversMovement.Instructions;
import RoversMovement.Position;
import RoversMovement.Rover;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTests {

    @Test
    @DisplayName("Tests rotate method returns point East when turning right from North")
    void testTurnRightFromNorth() {
        // Arrange
        Rover rover = new Rover(new Position(3,2,Directions.N));
        // Act
        Directions result = rover.turnRight(Instructions.R);
        // Assert
        assertEquals(Directions.E, result);
    }

@Test
@DisplayName("Tests rotate method returns right position when turning right from any point")
void testTurnRight() {
    // Arrange
    Rover rover = new Rover(new Position(3,2,Directions.N));
    Rover roverOne = new Rover(new Position(3,2,Directions.E));
    Rover roverTwo = new Rover(new Position(3,2,Directions.S));
    Rover roverThree = new Rover(new Position(3,2,Directions.W));

    // Act
    Directions result = rover.turnRight(Instructions.R);
    Directions resultOne = roverOne.turnRight(Instructions.R);
    Directions resultTwo = roverTwo.turnRight(Instructions.R);
    Directions resultThree = roverThree.turnRight(Instructions.R);

    // Assert
    assertAll("grouped assertions of turning right",
            () -> assertEquals(result, Directions.E),
            () -> assertEquals(resultOne, Directions.S),
            () -> assertEquals(resultTwo,Directions.W),
            () -> assertEquals(resultThree, Directions.N));
}
}