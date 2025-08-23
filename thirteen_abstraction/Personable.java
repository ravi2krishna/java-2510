package thirteen_abstraction;

public interface Personable {

    // contract --> must have 
    public void setPersonDetails(); // common for all entities 
    public void displayPersonDetails(); // common for all entities 
    default void achievementStatus() {}; // only students

}
