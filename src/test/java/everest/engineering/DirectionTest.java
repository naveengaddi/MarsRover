package everest.engineering;

import org.junit.jupiter.api.Test;

import static everest.engineering.Direction.EAST;
import static everest.engineering.Direction.NORTH;
import static everest.engineering.Direction.SOUTH;
import static everest.engineering.Direction.WEST;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DirectionTest {

    @Test
    void shouldReturnNorthLeftAsWest() {
        assertEquals(WEST, NORTH.left());
    }

    @Test
    void shouldReturnNorthRightAsEast() {
        assertEquals(EAST, NORTH.right());
    }

    @Test
    void shouldReturnEastRightAsSouth() {
        assertEquals(SOUTH, EAST.right());
    }

    @Test
    void shouldReturnEastLeftAsNorth() {
        assertEquals(NORTH, EAST.left());
    }

    @Test
    void shouldReturnSouthLeftAsEast() {
        assertEquals(EAST, SOUTH.left());
    }

    @Test
    void shouldReturnSouthRightAsWest() {
        assertEquals(WEST, SOUTH.right());
    }

    @Test
    void shouldReturnWestRightAsNorth() {
        assertEquals(NORTH, WEST.right());
    }

    @Test
    void shouldReturnWestLeftAsSouth() {
        assertEquals(SOUTH, WEST.left());
    }

    @Test
    void shouldReturnNorthForwardStepSizeInYasOne() {
        assertEquals(1, NORTH.stepSizeInY());
    }


    @Test
    void shouldReturnSouthForwardStepSizeInYasNegativeOne() {
        assertEquals(-1, SOUTH.stepSizeInY());
    }


    @Test
    void shouldReturnEastForwardStepInXasOne() {
        assertEquals(1, EAST.stepSizeInX());
    }


    @Test
    void shouldReturnWestForwardStepInXasNegativeOne() {
        assertEquals(-1, WEST.stepSizeInX());
    }

}