import java.util.List;

public class Fox {

    private String name;
    private String color;
    private int age;
    public static List<Fox> foxList;

    public Fox(String name, String color, int age) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public static void main(String[] args) {
        Fox fox1 = new Fox("fox1", "red", 3);
        Fox fox2 = new Fox("fox2", "black", 5);
        Fox fox3 = new Fox("fox3", "white", 10);
        Fox fox4 = new Fox("fox4", "red", 7);
        Fox fox5 = new Fox("fox5", "black", 9);
        Fox fox6 = new Fox("fox6", "red", 8);
        Fox fox7 = new Fox("fox7", "red", 2);
        Fox fox8 = new Fox("fox8", "orange", 4);
        Fox fox9 = new Fox("fox9", "green", 9);

        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);
        foxList.add(fox4);
        foxList.add(fox5);
        foxList.add(fox6);
        foxList.add(fox7);
        foxList.add(fox8);
        foxList.add(fox9);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Fox{" +
                 name + ", " +
                 color + ", " +
                 age +
                '}';
    }
}
