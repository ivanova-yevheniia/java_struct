package proxyStudent;

public class main {
    public static void main(String[] args)throws Exception{

        // create default student
        Student student1 = new Student("Ivan", "Ivanov", 3, 7683);
        System.out.println(student1.toString());

        // create student with diploma
        Student student2 = new StudentDiploma("Alex", "Alexeenko", 4, 8790, "Why I love KPI");

        // get Class names
        System.out.println("Parent class name: " + Student.class.getName() + "\nChild class name: " + StudentDiploma.class.getName());

        //get Methods names + specifiers
    }
}
