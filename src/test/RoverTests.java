import RoversMovement.Directions;
import RoversMovement.Instructions;
import RoversMovement.Position;
import RoversMovement.Rover;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTests {

    @Test
    @DisplayName("Tests rotate method returns point East when turning right from North")
    void testTurnRight() {
        // Arrange
        Rover rover = new Rover(new Position(3,2,Directions.N));

        // Act
        Directions result = rover.turnRight(Instructions.R);

        // Assert
        assertEquals(Directions.E, result);
    }
}
