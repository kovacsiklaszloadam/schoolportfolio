package Animal;

public class Main {

    public static void main(String[] args) {

        Animals dog = new Animals(50, 50);
        dog.play();
        dog.eat();

        System.out.println(dog.hunger);
        System.out.println(dog.thirst);
    }
}
