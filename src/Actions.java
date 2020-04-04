/**
 * Actions
 */
public interface Actions {

    public Coords step(Direction dir);

    public Grid initializeGrid(Coords dimensions, boolean cordoned);
}