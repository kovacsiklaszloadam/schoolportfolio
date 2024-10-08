package GardenApplication;

public class Flower {

    static int waterAmount;
    static String name;

    Flower(String name, int waterAmount) {
        this.name = name;
        this.waterAmount = 0;
        Garden.objectCount++;

    }

    static String needsWater = (waterAmount < 5) ? "Flower needs water." : "Flower doesn't need water.";
}
