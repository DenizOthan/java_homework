public class Educator
{

    int educatorId;
    String courses;
    String name;
    String surName;

    public Educator(){
        System.out.println("EDUCATOR VIEWED.");
        System.out.println("+++++++++++++++++");
    }
    public Educator( int educatorId,String courses,String name,String surName){
        this.educatorId=educatorId;
        this.courses=courses;
        this.name=name;
        this.surName=surName;
    }
}
