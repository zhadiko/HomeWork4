import SpaceUsageTooMuchException.SpaceUsageTooMuchException;

import java.util.ArrayList;
import java.util.List;

public class Building {
    String name;
    List<Room> rooms = new ArrayList<Room>();

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public Room getRoom(Room r) {
        Room result = null;
        for (Room room : rooms) {
            if (room.equals(r)) result = r;
        }
        return result;
    }

    public void describe() throws IlluminanceTooMuchException, SpaceUsageTooMuchException {
        System.out.println(name);

        for (int i = 0; i < rooms.size(); i++) {
            rooms.get(i).getName();
            int summaryWindows = rooms.get(i).getWindow() * 700;
            int summaryLamps = 0;
            int summaryFurSquare = 0;

            for (int j = 0; j < rooms.get(i).lamps.size(); j++) {
                summaryLamps += rooms.get(i).lamps.get(j).getIllumination();
            }
            for (int k = 0; k < rooms.get(i).furnitures.size(); k++) {
                summaryFurSquare += rooms.get(i).furnitures.get(k).square;
            }
            int summaryFreeSquare = rooms.get(i).getSquare() - summaryFurSquare;
            int totalIllumination = summaryWindows + summaryLamps;
            if (totalIllumination > 4000) throw  new IlluminanceTooMuchException();
            if (summaryFurSquare > rooms.get(i).square *0.7){
                throw new SpaceUsageTooMuchException();
            }

            System.out.println(rooms.get(i).getName());
            System.out.println("Освещённость = " + totalIllumination + "( " + rooms.get(i).getWindow() + " окна по 700 лк, лампочки: " + summaryLamps + " лк)");
            System.out.println("Площадь: " + rooms.get(i).getSquare() + "м^2, (занято " + summaryFurSquare + " м^2, гарантированно свободно " + summaryFreeSquare + " м^2 или " + summaryFreeSquare * 100 / rooms.get(i).getSquare() + "% площади)");
            System.out.println("Мебель:");
            if (!rooms.get(i).furnitures.isEmpty()) {
                for (int m = 0; m < rooms.get(i).furnitures.size(); m++) {
                    System.out.println(rooms.get(i).furnitures.get(m).getName() + " (площадь " + rooms.get(i).furnitures.get(m).square + "м^2)");
                }
            } else {
                System.out.println("Мебели нет");

            }

        }
    }
}
