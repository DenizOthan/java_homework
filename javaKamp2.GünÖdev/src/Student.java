public class Student {
    String name;
    String surName;
    int id;
    String eMail;

    public Student(){
        System.out.println("STUDENT ADDED");
    }
    public Student(String name, String surName,int id,String eMail){
        this.name=name;
        this.surName=surName;
        this.id=id;
        this.eMail=eMail;

    }
}
