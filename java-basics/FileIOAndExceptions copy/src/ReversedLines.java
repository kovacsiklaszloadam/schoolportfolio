import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method called `decryptReversed` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the reversed-lines.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        decryptReversed("reversed-lines.txt");


    }

    private static void decryptReversed(String filePath) {

        Path path = Paths.get(filePath);
        List<String> decryptedFile = new ArrayList<>();

        try {
           List<String> lines = Files.readAllLines(path);
            for (String str : lines) {
                char[] charArray = str.toCharArray();
                int left = 0;
                int right = charArray.length - 1;

                while (left < right) {
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                }

                decryptedFile.add(new String(charArray));
            }

                try {
                    Path outputPath = Paths.get("output.txt");
                    Files.write(outputPath, decryptedFile);
                } catch (IOException e) {
                    System.out.println("File could not be written.");
                }


        } catch (IOException e) {
            System.out.println("File could not be read.");
        }

    }
}
