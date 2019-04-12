import java.io.*;
import java.nio.file.*;
import java.util.*;
import util.Input;

public class ContactsManager {


    private List<String> ContactList = new ArrayList<>();

    public static void main(String[] args) {
        String directory = "data";
        String fileName = "contacts";


        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, fileName);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
            Files.write(
                    Paths.get("data", fileName),
                    Arrays.asList("Jim"),
                    StandardOpenOption.APPEND
            );
        } catch(IOException e) {
            System.out.println(e);
        }
    }



}
