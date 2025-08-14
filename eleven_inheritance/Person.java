package eleven_inheritance;

public class Person {

    // common attributes of any person
    // As of now it's Student and Trainer
    // But in future it can be Mentor, VideoAdmin etc
    int personID;
    String personName;
    int personAge;
    long personMobileNumber;

    // common constructors for initializations
    public Person() {}

    public Person(int personID, String personName, int personAge, long personMobileNumber) {
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
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
