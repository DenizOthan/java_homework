package java_odev3;

public class StudentManager extends UserManager {
    public void registeredCoursList(Student student) {
        System.out.printf("ÖÐRENCÝNÝN KAYITLI OLDUÐU KURSLAR:\n", student.getId());
        for (String course: student.getRegisteredCourses()) {
            System.out.println(course);
        }
    }
}