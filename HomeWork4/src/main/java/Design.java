import SpaceUsageTooMuchException.SpaceUsageTooMuchException;

public class Design {
    public static void main(String[] args) {
        Building building = new Building("Building1");
        Room room1 = new Room("room1", 100, 3);
        Room room2 = new Room("room2", 5, 2);

        Lamp lamp1 = new Lamp("Lamp1", 150);
        Lamp lamp2 = new Lamp("Lamp2", 250);

        Furniture furniture1 = new Table("Desktop", 3);
        Furniture furniture2 = new Chair("Fluffy armchair", 2);


        building.addRoom(room1);
        building.addRoom(room2);

        building.getRoom(room1).addLamp(lamp1);
        building.getRoom(room1).addLamp(lamp2);

        building.getRoom(room1).addFurniture(furniture1);
        building.getRoom(room1).addFurniture(furniture2);

        try {
            building.describe();
        } catch (IlluminanceTooMuchException e) {
            e.printStackTrace();
        } catch (SpaceUsageTooMuchException e) {
            e.printStackTrace();
        }

    }

}