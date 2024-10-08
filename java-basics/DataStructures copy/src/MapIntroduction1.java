import java.util.HashMap;


public class MapIntroduction1 {

    public static void main(String[] args) {
        HashMap<Integer, Character> map = new HashMap<>();

        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.put(68, 'D');

        System.out.println(map.size());
        System.out.println(map.get(99));

        map.remove(97);

        System.out.println(map.containsKey(100));

        map.remove(98);
        map.remove(99);
        map.remove(65);
        map.remove(66);
        map.remove(67);
        map.remove(68);

        System.out.println(map.size());


    }
}
