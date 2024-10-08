package GreenFoxOrganization;

public class Person {

    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";

    }

    public void getGoal() {
        System.out.println("My goal is to live for the moment!");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + "a" + age + "year old" + gender);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
