/**
 * Hello world!
 *
 */
public class App {

    private String name;

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int maxValue(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Game game = new Game();

        Grid grid = game.initializeGrid(new Coords( new int[] {9, 18}), false);

        System.out.println(grid.toString());
    }

}
