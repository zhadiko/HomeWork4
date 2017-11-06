import java.util.ArrayList;
import java.util.List;

public class Room {
    String name;
    int square;
    int window;
    List<Lamp> lamps = new ArrayList<Lamp>();
    List<Furniture> furnitures = new ArrayList<Furniture>();

    public Room(String name, int square, int window) {
        this.name = name;
        this.square = square;
        this.window = window;
    }

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

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void addLamp(Lamp l) {
        lamps.add(l);
    }

    public void addFurniture(Furniture fur) {
        furnitures.add(fur);
    }
}
