import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(phoneBook.get("John K. Miller"));

        String value = "307-687-2982";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                System.out.println(entry.getKey());
            }

        }

        if (phoneBook.containsKey("Chris E. Myers")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
