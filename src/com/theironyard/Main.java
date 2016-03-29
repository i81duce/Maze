package com.theironyard;

import java.util.ArrayList;

public class Main {

    static final int SIZE = 10;

    static ArrayList<ArrayList<Room>> createRooms() {
        ArrayList<ArrayList<Room>> rooms = new ArrayList<>();
        for (int row = 0; row < SIZE; row++) {
            ArrayList<Room> roomRow = new ArrayList<>();
            for (int col = 0; col <SIZE; col++) {
                roomRow.add(new Room(row, col));
            }
            rooms.add(roomRow);
        }
        return rooms;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Room>> rooms = createRooms();
        for (ArrayList<Room> room : rooms) {
            System.out.print(" _");
        }
        System.out.println();
        for (ArrayList<Room> row : rooms) {
            System.out.print("|");
            for (Room room : row) {
                if (room.hasBottom) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }

                if (room.hasRight) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
