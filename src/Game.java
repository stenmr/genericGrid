import java.util.Random;

/**
 * Game
 */
public class Game implements Actions {

    Coords pos = new Coords(new int[] {0, 0});

    @Override
    public Coords step(Direction dir) {
        return this.pos.step(dir);
    }

    @Override
    public Grid initializeGrid(Coords dimensions, boolean cordoned) {
        char[][] grid = new char[dimensions.x][dimensions.y];
        char cordon = '#';
        char air = '.';

        for (int i = 0; i < dimensions.x; i++) {
            for (int j = 0; j < dimensions.y; j++) {
                grid[i][j] = air;
                if (cordoned && (i == 0 || i == dimensions.x - 1 || j == 0 || j == dimensions.y - 1)) {
                    grid[i][j] = cordon;
                }
            }
        }
        return new Grid(grid);
    }
}
