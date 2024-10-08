import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
      HashMap<String, String> bookMap = new HashMap<>();

      bookMap.put("978-1-60309-452-8", "A Letter to Jo");
      bookMap.put("978-1-60309-459-7", "Lupus");
      bookMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
      bookMap.put("978-1-60309-461-0", "The Lab");

      for (Map.Entry<String, String> entry: bookMap.entrySet()) {
        String key = entry.getKey();
        String value = entry.getValue();

        System.out.println(value + " (ISBN: " + key + ")");
      }

      bookMap.remove(978-1-60309-444-3);

      String valueToRemove = "The Lab";
      String keyToRemove = null;

      for (Map.Entry<String, String> entry : bookMap.entrySet()) {
        if (entry.getValue().equals(valueToRemove)) {
          keyToRemove = entry.getKey();
          break;
        }
      }

      bookMap.remove(keyToRemove);

      bookMap.put("978-1-60309-450-4", "They Called Us Enemy");
      bookMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

      System.out.println(bookMap.containsKey("478-0-61159-424-8"));
      System.out.println(bookMap.get("978-1-60309-453-5"));

        

    }
}

