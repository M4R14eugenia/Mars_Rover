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
    @DisplayName("Tests method returns point East when turning right from North")
    void testTurnRightFromNorth() {
        // Arrange
        Position position = new Position(3, 2, Directions.N);
        Rover rover = new Rover(position);
        // Act
        rover.turnRight(Instructions.R);
        // Assert
        assertEquals(Directions.E, position.getFacing());
    }


@Test
@DisplayName("Tests method returns right position when turning right from any point")
void testTurnRight() {
    // Arrange
    Position position = new Position(3,2,Directions.N);
    Rover rover = new Rover(position);
    Position position1 = new Position(3,4,Directions.E);
    Rover roverOne = new Rover(position1);
    Position position2 = new Position(3,1,Directions.S);
    Rover roverTwo = new Rover(position2);
    Position position3 = new Position(4,2,Directions.W);
    Rover roverThree = new Rover(position3);

    // Act
    rover.turnRight(Instructions.R);
    roverOne.turnRight(Instructions.R);
    roverTwo.turnRight(Instructions.R);
    roverThree.turnRight(Instructions.R);

    // Assert
    assertAll("grouped assertions of turning right",
            () -> assertEquals(position.getFacing(), Directions.E),
            () -> assertEquals(position1.getFacing(), Directions.S),
            () -> assertEquals(position2.getFacing(),Directions.W),
            () -> assertEquals(position3.getFacing(), Directions.N));
}

    @Test
    @DisplayName("Tests method returns point West when turning left from North")
    void testTurnLeftFromNorth() {
        // Arrange
        Position position = new Position(3, 2, Directions.N);
        Rover rover = new Rover(position);
        // Act
        rover.turnLeft(Instructions.L);
        // Assert
        assertEquals(Directions.W, position.getFacing());
    }
    @Test
    @DisplayName("Tests method returns right position when turning left from any point")
    void testTurnLeft() {
        // Arrange
        Position position = new Position(3,2,Directions.N);
        Rover rover = new Rover(position);
        Position position1 = new Position(3,4,Directions.E);
        Rover roverOne = new Rover(position1);
        Position position2 = new Position(3,1,Directions.S);
        Rover roverTwo = new Rover(position2);
        Position position3 = new Position(4,2,Directions.W);
        Rover roverThree = new Rover(position3);

        // Act
        rover.turnLeft(Instructions.L);
        roverOne.turnLeft(Instructions.L);
        roverTwo.turnLeft(Instructions.L);
        roverThree.turnLeft(Instructions.L);

        // Assert
        assertAll("grouped assertions of turning right",
                () -> assertEquals(position.getFacing(), Directions.W),
                () -> assertEquals(position1.getFacing(), Directions.N),
                () -> assertEquals(position2.getFacing(),Directions.E),
                () -> assertEquals(position3.getFacing(), Directions.S));
    }
    @Test
    @DisplayName("Tests method returns new position in Plateau when moved when facing North.")
    void testMoveNorth() {
        // Arrange
        Position position = new Position(5, 2, Directions.N);
        Rover rover = new Rover(position);
        // Act
        rover.move(Instructions.M);
        // Assert
        assertEquals(3,position.getY());
    }
    @Test
    @DisplayName("Tests method returns new position in Plateau when moved facing any direction")
    void testMove() {
        // Arrange
        Position position = new Position(5, 2, Directions.N);
        Rover rover = new Rover(position);
        Position positionOne = new Position(5, 2, Directions.E);
        Rover roverOne = new Rover(positionOne);
        Position positionTwo = new Position(5, 2, Directions.S);
        Rover roverTwo = new Rover(positionTwo);
        Position positionThree = new Position(5, 2, Directions.W);
        Rover roverThree = new Rover(positionThree);
        // Act
        rover.move(Instructions.M);
        roverOne.move(Instructions.M);
        roverTwo.move(Instructions.M);
        roverThree.move(Instructions.M);

        // Assert
        assertEquals(3,position.getY());
        assertEquals(6,positionOne.getX());
        assertEquals(1,positionTwo.getY());
        assertEquals(4,positionThree.getX());

    }
}
//if facing North = y+1; if facing South y-1; if facing east x-1; if facing west x+1
