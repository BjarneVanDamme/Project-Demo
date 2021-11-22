import java.time.LocalDate;

public class Person {
    private String lastName;
    private String firstName;
    private int personNumber;
    private String telephoneNumber;
    private String mail;
    private LocalDate birthDay;

    public Person(String lastName, String firstName, int personNumber, String telephoneNumber, String mail, LocalDate birthDay) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.personNumber = personNumber;
        this.telephoneNumber = telephoneNumber;
        this.mail = mail;
        this.birthDay = birthDay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
