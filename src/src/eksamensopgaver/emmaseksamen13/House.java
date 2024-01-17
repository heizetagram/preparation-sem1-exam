package eksamensopgaver.emmaseksamen13;

import java.util.ArrayList;
import java.util.Random;

public class House {
    private ArrayList<Room> rooms = new ArrayList<>();

    public void generateRooms() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            rooms.add(new Room(random.nextInt(90) + 11, random.nextInt(90) + 11));
        }
    }

    public static void main(String[] args) {
        House h1 = new House();
        h1.generateRooms();
        h1.printAllRooms();
        System.out.println("Room with biggest area: " + h1.getRoomWithBiggestArea().getWidth() + ", " + h1.getRoomWithBiggestArea().getLength());
        System.out.println("The area: " + h1.getRoomWithBiggestArea().getWidth() * h1.getRoomWithBiggestArea().getLength());
    }

    private void printAllRooms() {
        for (Room room : rooms) {
            System.out.println("w; " + room.getWidth() + " l; " + room.getLength());
        }
    }

    public Room getRoomWithBiggestArea() {
        int min = Integer.MIN_VALUE;
        Room roomWithBiggestArea = null;

        for (Room room : rooms) {
            int area = room.getWidth() * room.getLength();
            if (area > min) {
                min = area;
                roomWithBiggestArea = room;
            }
        }
        return roomWithBiggestArea;
    }
}
