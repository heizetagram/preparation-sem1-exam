package eksamensopgaver.iklassen.speedrun2.opg13eksamen;

import java.util.ArrayList;
import java.util.Random;

// 04:29 remaining

public class House {
    private ArrayList<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
    }

    public ArrayList<Room> generateRooms() {
        ArrayList<Room> randomRooms = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            randomRooms.add(new Room(random.nextInt(90) + 10, random.nextInt(90) + 10));
        }
        return randomRooms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoomWithBiggestArea() {
        int biggestArea = Integer.MIN_VALUE;
        Room biggestRoom = null;

        for (Room room : rooms) {
            int area = room.getWidth() * room.getLength();
            if (area > biggestArea) {
                biggestArea = room.getWidth() * room.getLength();
                biggestRoom = room;
            }
        }
        return biggestRoom;
    }

    public static void main(String[] args) {
        House house1 = new House();

        house1.getRooms().addAll(house1.generateRooms());

        System.out.println("Random rooms:");
        for (Room room : house1.getRooms()) {
            System.out.println("W: " + room.getWidth() + ", L: " + room.getLength());
        }

        System.out.println("\nBiggest room:");
        System.out.println("W: " + house1.getRoomWithBiggestArea().getWidth() + ", L: " + house1.getRoomWithBiggestArea().getLength());
        int biggestArea = house1.getRoomWithBiggestArea().getWidth() * house1.getRoomWithBiggestArea().getLength();
        System.out.println("Area: " + biggestArea);
    }
}
