public class Main {

    public static void main(String[] args) {
        Educator educator1=new Educator(
                2568,
                "JAVA+REACT CAMP",
                "ENGİN",
                "DEMİROĞ"

        );

        Educator educator2=new Educator(
                2568,
                "PROGRAMLAMAYA GİRİŞ",
                "ENGİN",
                "DEMİROĞ"
        );

        Educator educator3=new Educator(
                2568,
                "C# + ANGULAR",
                "ENGİN",
                "DEMİROĞ"

        );


        Educator[] educators ={educator1,educator2,educator3};
        System.out.println("+++++++++++++++++++");
        for (Educator edc:educators){
            System.out.println("Educator Name and Surname : " + edc.name + " " + edc.surName);
            System.out.println("Course Name : " + edc.courses);
            System.out.println("Course ID : " + edc.educatorId);
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }

        Student Deniz=new Student(
                "Deniz",
                "Othan",
                21,
                "++++++@gmail.com");
        Student[]student={Deniz};
        for(Student std : student)
        {
            System.out.println("Student Name and Surname : " + std.name + " " + std.surName);
            System.out.println("Student ID : " + std.id);
            System.out.println("Student E-Mail " + std.eMail);
        }
        Category category1 = new Category();
        category1.id = 2568;
        category1.name="Software";
        System.out.println("Category ID and Name : " + category1.id + " / " + category1.name);

        CategoryManager categoryManager = new CategoryManager();

        categoryManager.addToCategory(category1);

        System.out.println("++++++++++++++++++++++++++++++++");
    }




    }

