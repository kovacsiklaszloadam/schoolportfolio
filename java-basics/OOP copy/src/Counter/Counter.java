package Counter;

public class Counter {

    int count;

    Counter(int count) {

        this.count = count;
    }

    public void add(int number) {

        count += number;
    }

    public void add() {

        count += 1;
    }

    public void get() {

        System.out.println(count);
    }

    public void reset() {

        count = 0;
    }
}
