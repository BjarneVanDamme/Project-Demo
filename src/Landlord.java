import java.time.LocalDate;

public class Landlord extends Person{
    private int landlordNumber;
    private Building ownsBuilding;

    public Landlord(String lastName, String firstName, int personNumber, String telephoneNumber, String mail, LocalDate birthDay, int landlordNumber, Building ownsBuilding) {
        super(lastName, firstName, personNumber, telephoneNumber, mail, birthDay);
        this.landlordNumber = landlordNumber;
        this.ownsBuilding = ownsBuilding;
    }

    public int getLandlordNumber() {
        return landlordNumber;
    }

    public void setLandlordNumber(int landlordNumber) {
        this.landlordNumber = landlordNumber;
    }

    public Building getOwnsBuilding() {
        return ownsBuilding;
    }

    public void setOwnsBuilding(Building ownsBuilding) {
        this.ownsBuilding = ownsBuilding;
    }
}
