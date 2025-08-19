package tweleve_encapsulation;

public class Person {

    // common attributes of any person
    // As of now it's Student and Trainer
    // But in future it can be Mentor, VideoAdmin etc

    // implementing encapsulation -- private
    private int personID;
    private String personName;
    private int personAge;
    private long personMobileNumber;

    // getters & setters
    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    // let's validate age - age should be above 0
    public void setPersonAge(int personAge) {
        // using condition
        if (personAge>0) {
            this.personAge = personAge;
        } else {
            System.out.println("Age is invalid");
        }
    }

    public long getPersonMobileNumber() {
        return personMobileNumber;
    }

    public void setPersonMobileNumber(long personMobileNumber) {
        this.personMobileNumber = personMobileNumber;
    }

    // common method for any person, like displaying info
    public void displayInfo() {
        System.out.println("======= Info =======");
        System.out.println("ID: "+personID);
        System.out.println("Name: "+personName);
        System.out.println("Age: "+personAge);
        System.out.println("Mobile: "+personMobileNumber);
        System.out.println("======= Info =======");
    }

}
