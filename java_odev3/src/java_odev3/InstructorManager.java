package java_odev3;
public class InstructorManager extends UserManager{
    public void offeredCoursesList(Instructor instructor) {
        System.out.printf("ENGÝN DEMÝROG TARAFINDAN VERÝLEN KURSLAR\n", instructor.getFullName());
        for (String course: instructor.getCoursesOffered()) {
            System.out.println(course);
        }
    }

    public void certificatesList(Instructor instructor) {
        System.out.printf("EÐÝTMENÝN SERTÝFÝKALARI\n", instructor.getFullName());
        for (String certificate: instructor.getCertificates()) {
            System.out.println(certificate);
        }
    }
}
