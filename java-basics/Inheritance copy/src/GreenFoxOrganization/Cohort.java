package GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    Cohort(String name) {
        this.name = name;
        students = new ArrayList<Student>();
        mentors = new ArrayList<Mentor>();
    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);

    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");

    }
}
