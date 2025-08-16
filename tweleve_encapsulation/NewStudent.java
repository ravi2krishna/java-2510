package tweleve_encapsulation;

public class NewStudent {
    
    private int id;
    private String name;
    private boolean isAttended;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAttended() {
        return isAttended;
    }
    public void setAttended(boolean isAttended) {
        this.isAttended = isAttended;
    }

    

    // public void setAttendance(boolean isAttended) {
    //     // condition check i want to implement
    //     if (!isAttended)
    //     this.isAttended = isAttended;
    //     System.out.println("Teacher Assigned Student Attendance");
    // }

    // public boolean getAttendance() {
    //     System.out.println("Teacher Assigned Student Attendance");
    //     return isAttended;
    // }

}
