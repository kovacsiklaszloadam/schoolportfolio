package Sharpie;

public class Main {

    public static void main(String[] args) {

        Sharpie yellow = new Sharpie("yellow", 10, 100);
        Sharpie blue = new Sharpie("blue", 15, 100);
        Sharpie red = new Sharpie("red", 20, 100);

        red.use();
        red.use();
        blue.use();
        yellow.use();

        System.out.println(blue.inkAmount);
        System.out.println(red.inkAmount);
        System.out.println(yellow.inkAmount);
    }
}
