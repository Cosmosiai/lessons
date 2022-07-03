package homework.hw2_2.hwB;

public class Course {
    private String courseName;
    private String creationDate;
    private String fullName;
    private static int ID=0;

    public Course() {
        ID++;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public static int getID() {
        return ID;
    }
}
