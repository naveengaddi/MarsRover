package everest.engineering;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static everest.engineering.Direction.NORTH;
import static everest.engineering.Direction.SOUTH;
import static everest.engineering.Direction.WEST;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void robotHasInitialPosition() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);
        Coordinates robotCoordinates = rover.getCurrentCoordinates();
        assertEquals(new Coordinates(1, 2), robotCoordinates);
    }

    @Test
    void robotHasInitialFace() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);

        assertEquals(Direction.NORTH, rover.getCurrentDirection());
    }

    @Test
    void robotCanMoveForward() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);

        rover.moveForward();

        assertEquals(new Coordinates(1, 3), rover.getCurrentCoordinates());
    }

    @Test
    void robotCanMove2SteForward() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);

        rover.moveForward();
        rover.moveForward();

        assertEquals(new Coordinates(1, 4), rover.getCurrentCoordinates());
    }


    @Test
    void robotCanMoveBackward() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);

        rover.moveBackward();

        assertEquals(new Coordinates(1, 1), rover.getCurrentCoordinates());
    }

    @Test
    void robotMoveBackAndMoveForwardIsInitialPosition() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);

        rover.moveBackward();
        rover.moveForward();

        assertEquals(new Coordinates(1, 2), rover.getCurrentCoordinates());
    }

    @Test
    void robotCanTurnLeft() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);
        rover.turnLeft();

        assertEquals(WEST, rover.getCurrentDirection());
    }

    @Test
    void robotTurnLeftTwiceBecomesSouth() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.NORTH);
        rover.turnLeft();
        rover.turnLeft();

        assertEquals(SOUTH, rover.getCurrentDirection());
    }

    @Test
    void robotTurnLeftAndMovesForward() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.EAST);
        rover.turnLeft();
        rover.moveForward();
        assertEquals(NORTH, rover.getCurrentDirection());
        assertEquals(new Coordinates(1, 3), rover.getCurrentCoordinates());
    }

    @Test
    void robotTurnRight() {
        Rover rover = new Rover(new Coordinates(1, 2), Direction.EAST);
        rover.turnRight();
        assertEquals(SOUTH, rover.getCurrentDirection());
    }
}