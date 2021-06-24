import java.util.ArrayList;

public class BiologyClassroom implements Classroom {
    private String classroomName;
    private ArrayList<Student> students;

    public BiologyClassroom(String classroomName, ArrayList<Student> students) {
        this.classroomName = classroomName;
        this.students = students;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    @Override
    public String addStudent(Student name) {
        students.add(name);
        return name.getFirstName() + " has been added to Biology.";
    }

    @Override
    public String removeStudent(int id) {
        students.remove(id);

        return students.get(id).getFirstName() + " has been removed from Biology.";

    }
}