import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method called `decryptReversed` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the reversed-order.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        decryptReversed("reversed-order.txt");
    }

    private static void decryptReversed(String path) {

        List<String> decryptedFile = new ArrayList<>();
        Path inputPath = Paths.get(path);
        Path outputPath = Paths.get("output2.txt");

        try {
            List<String> lines = Files.readAllLines(inputPath);
            for (int i = 0; i < lines.size(); i++) {
                decryptedFile.add(lines.get(lines.size() - 1 - i));
            }
            try {
                Files.write(outputPath, decryptedFile);
            } catch (IOException e) {
                System.out.println("Could not write file.");
            }
        } catch (IOException e) {
            System.out.println("Could not read file.");
        }

    }
}
