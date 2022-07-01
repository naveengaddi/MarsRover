package everest.engineering;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rover {
    private Coordinates currentCoordinates;
    private Direction currentDirection;

    public void moveForward() {
        currentCoordinates = currentCoordinates.moveForwardIn(currentDirection);
    }

    public void moveBackward() {
        currentCoordinates = currentCoordinates.moveBackIn(currentDirection);
    }

    public void turnLeft() {
        currentDirection = currentDirection.left();
    }

    public void turnRight() {
        currentDirection = currentDirection.right();
    }
}
