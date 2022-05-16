package com.hotel.model;

import java.util.Objects;

class Room implements IRoom {
    public static final Room instance = new Room();
    private int roomNumber;
    private double price;
    private RoomType roomType;

    private Room() {
    }

    public Room getInstance() {
        return instance;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override //Identify condition
    public boolean isFree() {
        return false;
    }
    
public boolean equals(Object obj) {
    if (obj instanceof Room) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Room) obj;
    return this.roomNumber == that.roomNumber &&
            this.price == that.price &&
            this.roomType.equals(that.roomType);
}
    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, price, roomType);
    }

    @Override
    public String toString() {
        return "Room[" +
                "roomNumber=" + roomNumber + ", " +
                "price=" + price + ']';
    }
}