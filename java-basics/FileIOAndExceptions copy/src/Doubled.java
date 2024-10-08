import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Doubled {

    public static void main(String[] args) {
        // Create a method called `decryptDoubled` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the duplicated-chars.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.

        try {
            decryptDoubled("src/duplicated-chars.txt");
        } catch (IOException e) {
            System.err.println("File not found.");
        }
    }

    public static void decryptDoubled(String fileName) throws IOException{

        Path filePath = Paths.get(fileName);
        String file = Files.readString(filePath);

        StringBuilder sb = new StringBuilder();
        sb.append(file);

        for (int i = 1; i < file.length(); i++) {
            if (i % 2 != 0) {
                sb.deleteCharAt(i);
            }
        }

        String decryptedFile = sb.toString();
        String fileName2 = "src/output.txt";
        Path write = Paths.get(fileName2);
        Files.write(write, decryptedFile.getBytes());


    }
}