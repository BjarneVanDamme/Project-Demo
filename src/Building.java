public class Building {
    private String adres;
    private int buildingNumber;

    public Building(String adres, int buildingNumber) {
        this.adres = adres;
        this.buildingNumber = buildingNumber;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
