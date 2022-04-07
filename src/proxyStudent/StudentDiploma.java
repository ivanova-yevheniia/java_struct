package proxyStudent;

import proxyStudent.Student;

public class StudentDiploma extends Student {
    //Fields
    String diplomaThema;

    //Constructor
    StudentDiploma(String name, String surname, int course, int id, String diplomaThema) {
        super(name, surname, course, id);
        this.diplomaThema = diplomaThema;
    }

    //Methods
    public String getDiplomaThema() {
        return diplomaThema;
    }

    void setDiplomaThema(String diplomaThema){
        this.diplomaThema = diplomaThema;
    }
}
