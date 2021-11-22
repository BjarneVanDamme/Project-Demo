import java.time.LocalDate;

public class Student extends Person{
    private int studentID;
    private Room rentedRoom;

    public Student(String lastName, String firstName, int personNumber, String telephoneNumber, String mail, LocalDate birthDay, int studentID, Room rentedRoom) {
        super(lastName, firstName, personNumber, telephoneNumber, mail, birthDay);
        this.studentID = studentID;
        this.rentedRoom = rentedRoom;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Room getRentedRoom() {
        return rentedRoom;
    }

    public void setRentedRoom(Room rentedRoom) {
        this.rentedRoom = rentedRoom;
    }
}
