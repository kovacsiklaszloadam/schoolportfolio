package GreenFoxOrganization;

public class Student extends Person{

    private String previousOrganization;
    private int skippedDays;

    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;

    }

    Student() {
        super("Jane Doe", 30, "female");
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer!");

    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + " from " + previousOrganization +
                " who skipped " + skippedDays + " days from the course already.");

    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;

    }
}
