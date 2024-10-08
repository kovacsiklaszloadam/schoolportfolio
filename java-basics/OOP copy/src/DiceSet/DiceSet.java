package DiceSet;
import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> rollSet() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrentSet() {
        return dice;
    }

    public int getCurrentItem(int i) {
        return dice.get(i);
    }

    public void rerollSet() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void rerollItem(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {

        DiceSet diceSet = new DiceSet();
        System.out.println(diceSet.getCurrentSet());
        System.out.println(diceSet.rollSet());
        System.out.println(diceSet.getCurrentSet());
        System.out.println(diceSet.getCurrentItem(5));
        diceSet.rerollSet();
        System.out.println(diceSet.getCurrentSet());
        diceSet.rerollItem(4);
        System.out.println(diceSet.getCurrentSet());

        do {
            diceSet.rerollSet();
            System.out.println(diceSet.getCurrentSet());
        } while (!allDicesAreSix(diceSet));


    }

    private static boolean allDicesAreSix(DiceSet diceSet) {

        for (int i = 0; i < diceSet.getCurrentSet().size(); i++) {
            if (diceSet.getCurrentItem(i) != 6) {
                return false;
            }
        }
        return true;
    }
}