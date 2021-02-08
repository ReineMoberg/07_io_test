package se.lexicon.ReineMoberg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        List<String> content = Arrays.asList(
                "Hello", "World"
        );
        File url = new File("destination_folder/example.txt");
        write(url, content);
    }

    public static List<String> write(File destination, List<String> src) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            for (String toWrite : src) {
                writer.write(toWrite);
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return src;
    }

}
