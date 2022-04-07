package proxyStudent;

public class Student implements StudentInterface {

    // Fields
    String name;
    String surname;
    int course;
    int id;

    //Constructor
    Student(String name, String surname, int course, int id){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.id = id;
    }

    // Methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String valNam) {
        this.name = valNam;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String valSur) {
        this.surname = valSur;
    }

    @Override
    public int getCourse() {
        return course;
    }

    @Override
    public void setCourse(int valCourse) {
        this.course = valCourse;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int valId) {
        this.id = valId;
    }

    @Override
    public String toString() {
        return " Name: " + name + "\n Surname: " + surname + "\n Course: " + course + "\n ID: " + id + "\n";
    }
}
