package homework.hw2_1.oop.hwA;

public class Student {
    private String name;
    private int age;
    private int course;
    private String University;

    public Student(String name, int age, int course, String university) {
        this.name = name;
        this.age = age;
        this.course = course;
        University = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", University='" + University + '\'' +
                '}';
    }
}
