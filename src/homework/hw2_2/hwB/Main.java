package homework.hw2_2.hwB;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(16);
        student.setBirthDate("1/1/2011");
        student.setMale(true);
        student.setName("Alex");
        student.setSurname("Smith");

        Student student1 = new Student();
        student1.setAge(18);
        student1.setBirthDate("1/1/1991");
        student1.setMale(false);
        student1.setName("Alexandra");
        student1.setSurname("Smith");

        Student[] students = {student,student1};
        Course course = new Course();
        course.setCourseName("PL");
        course.setCreationDate("1/9/2015");
        course.setFullName("Alexander L. Black");

        Groupe groupe = new Groupe(students, course, "1/9/2019",9);

        System.out.println("Course name = "+course.getCourseName()+"\nCreation Date = "+ course.getCreationDate()+"\nTeacher = "+ course.getFullName()+"\nID = "+course.getID()+"\n");
        for (Student i:groupe.getStudents()){
            System.out.println("Student\nName "+i.getName()+" "+i.getName()+"\nage = "+i.getAge()+"\ndate = "+i.getBirthDate());
            if(i.isMale()){
                System.out.println("Male\n");
            }else {
                System.out.println("Female\n");
            }
        }
        System.out.println("\nstudying beginning date = "+groupe.getBeginningDate()+"\nMonth = "+groupe.getMonths());
    }
}
