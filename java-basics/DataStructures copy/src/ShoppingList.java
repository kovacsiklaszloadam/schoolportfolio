import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("egg");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        if (shoppingList.contains("milk")) {
            System.out.println("yes");

        } else {
            System.out.println("no");

        }

        if (shoppingList.contains("bananas")) {
            System.out.println("yes");

        } else {
            System.out.println("no");

        }
    }
}
