package PostIt;

public class Main {

    public static void main(String[] args) {

        PostIt p = new PostIt("orange", "Idea1", "blue");
        PostIt p2 = new PostIt("pink", "Awesome", "black");
        PostIt p3 = new PostIt("yellow", "Superb!", "green");

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
}
