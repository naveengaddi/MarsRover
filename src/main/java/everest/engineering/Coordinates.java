package everest.engineering;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Coordinates {
    private final int xCoordinate;
    private final int yCoordinate;

    public Coordinates moveForwardIn(Direction direction) {
        return new Coordinates(xCoordinate + direction.stepSizeInX(), yCoordinate + direction.stepSizeInY());
    }

    public Coordinates moveBackIn(Direction direction) {
        return new Coordinates(xCoordinate - direction.stepSizeInX(), yCoordinate - direction.stepSizeInY());
    }
}
