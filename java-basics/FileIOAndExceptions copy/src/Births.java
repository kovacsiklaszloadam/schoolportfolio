import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Births {
    public static void main(String[] args) {
        // Create a function `getMostFrequentYear` which takes the name of a CSV file as a parameter,
        // - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
        // and returns the year (as a String) when the most births happened.
        // If there were multiple years with the same number of births then return any of them.
        // If the given file doesn't exist, the function should return "File not found"

        // Change the path of the /births.csv source file to the path where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        System.out.println(getMostFrequentYear("births.csv")); // should print "2006" or "2016"
        System.out.println(getMostFrequentYear("not-existing-file.csv")); // should print "File not found"
    }

    private static String getMostFrequentYear(String path) {

        Path filePath = Paths.get(path);
        List<String> birthDates = new ArrayList<>();
        List<String> birthYears = new ArrayList<>();
        HashMap<String, Integer> birthFrequencies = new HashMap<>();


        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String str : lines) {
                String[] words = str.split(";");
                birthDates.add(words[1]);
                for (String s : birthDates) {
                    String[] birthDates2 = s.split("-");
                    birthYears.add(birthDates2[0]);
                    for (String s2 : birthYears) {
                        Integer count = birthFrequencies.get(s2);
                        if (count == null) {
                            count = 0;
                        }
                            birthFrequencies.put(s2, count);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }

        String highestFrequency;
        Integer maxValue = 0;
        for (Map.Entry<String, Integer> entry : birthFrequencies.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
            }
            for (Map.Entry<String, Integer> entry1 : birthFrequencies.entrySet()) {
                if (maxValue.equals(entry1.getValue())) {
                    highestFrequency = entry1.getKey();
                    return highestFrequency;

                }
            }
        }
        return null;
    }
}
