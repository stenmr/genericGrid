
public class Coords {
    int x, y;

    public Coords(int[] coords) {
        this.x = coords[0];
        this.y = coords[1];
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public Coords step(Direction dir) {
        Coords movementDir = Direction.value(dir);
        return new Coords(new int[] {movementDir.x + this.x, movementDir.y + this.y});
    }

    @Override
    public String toString() {
        
        return "(" + String.valueOf(this.x) + "; " + String.valueOf(this.y) + ")";
    }
}