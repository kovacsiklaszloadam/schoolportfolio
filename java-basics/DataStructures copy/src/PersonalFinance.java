import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> spending = new ArrayList<>();
        spending.add(500);
        spending.add(1000);
        spending.add(1250);
        spending.add(175);
        spending.add(120);
        spending.add(800);

        int sum = 0;
        for (int i = 0; i <spending.size() ; i++) {
            sum += spending.get(i);
        }

        System.out.println(sum);
        System.out.println(Collections.max(spending));
        System.out.println(Collections.min(spending));
        System.out.println(sum / spending.size());
    }
}
