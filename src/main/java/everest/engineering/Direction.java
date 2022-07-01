package everest.engineering;

import lombok.ToString;

@ToString
public enum Direction {
    EAST() {
        @Override
        Direction left() {
            return NORTH;
        }

        @Override
        Direction right() {
            return SOUTH;
        }

        @Override
        int stepSizeInX() {
            return 1;
        }


        @Override
        int stepSizeInY() {
            return 0;
        }


    }, WEST() {
        @Override
        Direction left() {
            return SOUTH;
        }

        @Override
        Direction right() {
            return NORTH;
        }

        @Override
        int stepSizeInX() {
            return -1;
        }


        @Override
        int stepSizeInY() {
            return 0;
        }


    }, NORTH() {
        @Override
        Direction left() {
            return WEST;
        }

        @Override
        Direction right() {
            return EAST;
        }

        @Override
        int stepSizeInX() {
            return 0;
        }


        @Override
        int stepSizeInY() {
            return 1;
        }


    }, SOUTH() {
        @Override
        Direction left() {
            return EAST;
        }

        @Override
        Direction right() {
            return WEST;
        }

        @Override
        int stepSizeInX() {
            return 0;
        }


        @Override
        int stepSizeInY() {
            return -1;
        }

    };

    abstract Direction left();

    abstract Direction right();

    abstract int stepSizeInX();

    abstract int stepSizeInY();

}
