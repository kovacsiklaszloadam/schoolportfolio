import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {

        HashMap<String, Double> prices = new HashMap<>();
        prices.put("milk", 1.07);
        prices.put("rice", 1.59);
        prices.put("eggs", 3.14);
        prices.put("cheese", 12.60);
        prices.put("chicken breasts", 9.40);
        prices.put("apples", 2.31);
        prices.put("tomato", 2.58);
        prices.put("potatoes", 1.75);
        prices.put("onion", 1.10);

        HashMap<String, Integer> bobShoppingList = new HashMap<>();
        bobShoppingList.put("milk", 3);
        bobShoppingList.put("rice", 2);
        bobShoppingList.put("eggs", 2);
        bobShoppingList.put("cheese", 1);
        bobShoppingList.put("chicken breast", 4);
        bobShoppingList.put("apples", 1);
        bobShoppingList.put("tomato", 2);
        bobShoppingList.put("potato", 1);

        HashMap<String, Integer> aliceShoppingList = new HashMap<>();
        aliceShoppingList.put("rice", 1);
        aliceShoppingList.put("eggs", 5);
        aliceShoppingList.put("chicken breast", 2);
        aliceShoppingList.put("apples", 1);
        aliceShoppingList.put("tomato", 10);

        

    }
}
