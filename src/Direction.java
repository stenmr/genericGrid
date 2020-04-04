public enum Direction {

    UP, DOWN, LEFT, RIGHT;

    public static Coords value(Direction dir) {
        switch (dir) {
            case UP:
                return new Coords(new int[] { 0, 1 });
            case DOWN:
                return new Coords(new int[] { 0, -1 });
            case LEFT:
                return new Coords(new int[] { -1, 0 });
            case RIGHT:
                return new Coords(new int[] { 1, 0 });
            default:
                // Ma ei oska error handlimist Javas
                return new Coords(new int[] {0, 0});
        }
    }
}