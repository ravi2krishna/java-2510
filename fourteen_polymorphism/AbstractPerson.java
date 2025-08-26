package fourteen_polymorphism;

public abstract class AbstractPerson {

    // common data & behaviors
    // common attributes of any person
    // As of now it's Student and Trainer
    // But in future it can be Mentor, VideoAdmin etc

    // implementing encapsulation -- private
    private int personID;
    private String personName;
    private int personAge;
    private long personMobileNumber;
    private String personDescription;

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

    public String getPersonDescription() {
        return personDescription;
    }

    public void setPersonDescription(String personDescription) {
        this.personDescription = personDescription;
    }

    // Display Trainer Details -> as it's a contract
    public void displayPersonDetails(){
        System.out.println("======= Trainer Info =======");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Age: "+getPersonAge());
        System.out.println("Mobile: "+getPersonMobileNumber());
        System.out.println("======= Trainer Info =======");
    }


}
