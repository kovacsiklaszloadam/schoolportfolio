package Sharpie;

public class Sharpie {

    String color;
    int width;
    int inkAmount;

    Sharpie(String color, int width, int inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;

    }

    public void use() {
        inkAmount -= 10;

    }
}
