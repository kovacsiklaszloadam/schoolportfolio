import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {

    public static void main(String[] args) {

        // Write a function called countLines() that takes a filename as string as a parameter
        // and returns the number of lines the file contains.
        // It should return zero if it can't open the file
        // and should not raise any error.

        countLines("src/my-file-txt");

    }

    public static void countLines(String fileName) {

        Path filePath = Paths.get(fileName);

        try {
            System.out.println(Files.size(filePath));
        } catch (IOException e) {
            System.err.println(0);
        }


    }
}
