public class Furniture {
    String name;
    int square;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public Furniture(String name, int square) {
        this.name = name;
        this.square = square;
    }
}
