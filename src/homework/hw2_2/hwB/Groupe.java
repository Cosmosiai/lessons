package homework.hw2_2.hwB;

public class Groupe {
    private Student[] students;
    private Course course;
    private String beginningDate;
    private int Months;

    public Groupe(Student[] students, Course course, String beginningDate, int months) {
        this.students = students;
        this.course = course;
        this.beginningDate = beginningDate;
        Months = months;
    }

    public Student[] getStudents() {
        return students;
    }

    public Course getCourse() {
        return course;
    }

    public String getBeginningDate() {
        return beginningDate;
    }

    public int getMonths() {
        return Months;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setBeginningDate(String beginningDate) {
        this.beginningDate = beginningDate;
    }

    public void setMonths(int months) {
        Months = months;
    }


}
