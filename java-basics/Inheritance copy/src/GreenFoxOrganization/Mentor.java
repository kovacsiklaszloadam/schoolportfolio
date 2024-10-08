package GreenFoxOrganization;

public class Mentor extends Person{

    private String level;

    Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    Mentor() {
        super("Jane Doe", 30, "female");
        this.level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant software developers!");

    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " a " + getAge() + " year old " + getGender() + level + " mentor.");

    }
}
