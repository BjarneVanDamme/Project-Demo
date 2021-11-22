public class Room extends Building{
    private int numberOfWindows;
    private int roomNumber;

    public Room(String adres, int buildingNumber, int numberOfWindows, int roomNumber) {
        super(adres, buildingNumber);
        this.numberOfWindows = numberOfWindows;
        this.roomNumber = roomNumber;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
