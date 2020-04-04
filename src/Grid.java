
public class Grid {
    char [][] array;

    public Grid(char [][] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        String text = new String();
        // return super.toString();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                text += array[i][j];
                if (j == array[0].length - 1) {
                    text += "\n";
                }
            }
        }

        return text;
    }

    
}