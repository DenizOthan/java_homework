package java_odev3;

public class Instructor extends User {

    private String[] coursesOffered;
    private String[] certificates;

    public Instructor(int id, String fullName, String mailAddress, String[] coursesOffered, String[] certificates) {
        super(id, fullName, mailAddress);
        this.coursesOffered = coursesOffered;
        this.certificates = certificates;
    }

    public String[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }
}