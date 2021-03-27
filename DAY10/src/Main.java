import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            //Arraylist for Classrooms
            ArrayList<Student> bioStudent = new ArrayList<>();
            ArrayList<Student> engStudent = new ArrayList<>();
            ArrayList<Student> chemStudent = new ArrayList<>();


            //Students for Biology Class.
            Student Elijah = new Student(228622, "Elijah", "Cooper");
            Student Jigen = new Student(882455, "Jigen", "Anderson");
            Student Nigel = new Student(650835, "Nigel", "Uno");

            //Students for English Class
            Student Johnny = new Student(902451, "Johnny", "Bravo");
            Student Riley = new Student(556236, "Riley", "Jones");
            Student Jorge = new Student(915853, "Jorge", "Camcho");

            //Students for Chemistry Class
            Student Brian = new Student(746285, "Brian", "Johnson");
            Student Fred = new Student(153462, "Fred", "Ross");
            Student Nando = new Student(935623, "Nando", "Jones");


            // Assiging the Student Classes to their respective Class / Class.
            bioStudent.add(Elijah);
            bioStudent.add(Jigen);
            engStudent.add(Johnny);
            engStudent.add(Riley);
            chemStudent.add(Brian);
            chemStudent.add(Fred);

            //Creating the classrooms themselves.
            BiologyClassroom bioClass = new BiologyClassroom("Biology", bioStudent);
            ChemistryClassroom chemClass = new ChemistryClassroom("Chemistry", chemStudent);
            EnglishClassroom engClass = new EnglishClassroom("English", engStudent);

            // Attempt to see if the interface had worked on each
            System.out.println(bioClass.addStudent(Nigel));
            System.out.println(chemClass.addStudent(Jorge));
            System.out.println(engClass.addStudent(Nando));

            // Get ID attempt test
        System.out.println(bioClass.removeStudent(0));
        System.out.println(chemClass.removeStudent(0));
        System.out.println(engClass.removeStudent(0));








    }
}
