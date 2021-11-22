import java.time.LocalDate;

public class MonthlyEnergyConsumption {
    private int buildingNumber;
    private int landlordNumber;
    private double electricityConsumption;
    private double waterConsumption;
    private double gasConsumption;
    private LocalDate monthOfConsumption;

    public MonthlyEnergyConsumption(int buildingNumber, int landlordNumber, double electricityConsumption, double waterConsumption, double gasConsumption, LocalDate monthOfConsumption) {
        this.buildingNumber = buildingNumber;
        this.landlordNumber = landlordNumber;
        this.electricityConsumption = electricityConsumption;
        this.waterConsumption = waterConsumption;
        this.gasConsumption = gasConsumption;
        this.monthOfConsumption = monthOfConsumption;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getLandlordNumber() {
        return landlordNumber;
    }

    public void setLandlordNumber(int landlordNumber) {
        this.landlordNumber = landlordNumber;
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(double electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    public double getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(double waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public LocalDate getMonthOfConsumption() {
        return monthOfConsumption;
    }

    public void setMonthOfConsumption(LocalDate monthOfConsumption) {
        this.monthOfConsumption = monthOfConsumption;
    }
}
