package GardenApplication;

public class Garden {

    static int objectCount;

    public void water(int waterAmount) {
        if (Flower.waterAmount < 5) {
            Flower.waterAmount += (waterAmount / objectCount) * 0.75;
        }
        if (Tree.waterAmount < 10) {
            Tree.waterAmount += (waterAmount / objectCount) * 0.4;
        }

    }

    public void show() {

        System.out.println("The " + Flower.name + " " + Flower.needsWater);

    }
}
