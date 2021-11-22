public class Appliance {
    private int buildingNumber;
    private int roomNumber;
    private int applianceNumber;
    private String name;
    private String energyLabel;
    private String category; //kan in principe wel nog enumeration worden

    //Die "Category actions" aparte klasse of ja methode hiervan? Een Action klasse kan msschien wel interessant zijn

    public Appliance(int buildingNumber, int roomNumber, int applianceNumber, String name, String energyLabel, String category) {
        this.buildingNumber = buildingNumber; //misschien getter
        this.roomNumber = roomNumber; //misschien getter
        this.applianceNumber = applianceNumber;
        this.name = name;
        this.energyLabel = energyLabel;
        this.category = category;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getApplianceNumber() {
        return applianceNumber;
    }

    public void setApplianceNumber(int applianceNumber) {
        this.applianceNumber = applianceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnergyLabel() {
        return energyLabel;
    }

    public void setEnergyLabel(String energyLabel) {
        this.energyLabel = energyLabel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
