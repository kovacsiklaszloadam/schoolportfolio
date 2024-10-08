import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    // Write a `copy` function that copies the contents of a file into another file.
    // The function should take two filenames (strings) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows whether the copy was successful or not.

    public static void main(String[] args) {

       // Path filePath1 = Paths.get("src/myfile.txt");
        // Path filePath2 = Paths.get("src/myfile2.txt");

        File src = new File("src/myfile.txt");
        File dest = new File("src/myfile2.txt");

        copyFile(src, dest);
    }

    private static void copyFile(File src, File dest) {

        try {
            Files.copy(src.toPath(), dest.toPath());
        } catch (IOException e) {
            System.err.println("false");
            System.exit(1);
        } finally {
            System.out.println("true");
        }
    }
}

