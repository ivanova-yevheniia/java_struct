package proxyStudent;

import java.lang.reflect.*;

public class main {
    public static void main(String[] args)throws Exception {

        // create default student
        Student student1 = new Student("Ivan", "Ivanov", 3, 7683);
        System.out.println(student1.toString());

        // create student with diploma
        Student student2 = new StudentDiploma("Alex", "Alekseenko", 4, 8790, "Why I love KPI");

        // get Class names
        System.out.println("Parent class name: " + Student.class.getName() + "\nChild class name: " + StudentDiploma.class.getName());

        //get Methods names + modifiers + parameters --- for super class
        Method[] method = student1.getClass().getMethods();

        for (Method m : method) {
            if (m.getName().startsWith("get") || m.getName().startsWith("to") || m.getName().startsWith("set")) {
                System.out.print("Method name: " + m.getName());
                System.out.print(" | modifiers: ");
                int modifier = m.getModifiers();
                System.out.print(Modifier.toString(modifier));
                System.out.print(" | parameters: ");
                if (m.getName().startsWith("get") || m.getName().startsWith("to")) {
                    System.out.print("no parameters\n");
                } else {
                    Class[] parameterTypes = m.getParameterTypes();
                    for (Class p : parameterTypes) {
                        System.out.print(p.getName() + " ");
                    }
                    System.out.print("\n");
                }

            }
        }
    }
}
