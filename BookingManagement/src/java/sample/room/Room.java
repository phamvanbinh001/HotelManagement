/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.room;

/**
 *
 * @author ADMIN
 */
public class Room {
    private int roomId;
    private String roomNumber;
    private int doubleBeds;
    private int singleBeds;
    private Double pricePerDay;	
    private String type;
    private String amenitiesDescription;    
    private String imageUrl;
    private boolean isAvailable;

    public Room() {
    }

    public Room(int roomId, String roomNumber, int doubleBeds, int singleBeds, Double pricePerDay, String type, String amenitiesDescription, String imageUrl, boolean isAvailable) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.doubleBeds = doubleBeds;
        this.singleBeds = singleBeds;
        this.pricePerDay = pricePerDay;
        this.type = type;
        this.amenitiesDescription = amenitiesDescription;
        this.imageUrl = imageUrl;
        this.isAvailable = isAvailable;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDoubleBeds() {
        return doubleBeds;
    }

    public void setDoubleBeds(int doubleBeds) {
        this.doubleBeds = doubleBeds;
    }

    public int getSingleBeds() {
        return singleBeds;
    }

    public void setSingleBeds(int singleBeds) {
        this.singleBeds = singleBeds;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmenitiesDescription() {
        return amenitiesDescription;
    }

    public void setAmenitiesDescription(String amenitiesDescription) {
        this.amenitiesDescription = amenitiesDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomNumber=" + roomNumber + ", doubleBeds=" + doubleBeds + ", singleBeds=" + singleBeds + ", pricePerDay=" + pricePerDay + ", type=" + type + ", amenitiesDescription=" + amenitiesDescription + ", imageUrl=" + imageUrl + ", isAvailable=" + isAvailable + '}';
    }
}
