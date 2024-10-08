package Counter;

public class Main {

    public static void main(String[] args) {

        Counter c = new Counter(6);

        c.add();
        c.add(5);
        c.get();
        c.reset();
        c.get();
    }
}
