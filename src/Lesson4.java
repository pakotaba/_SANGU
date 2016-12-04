import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pavle
 */
public class Lesson4 {
    static String fileAdd1 = "./studentebi1.txt";
    static String fileAdd2 = "./studentebi2.txt";
    public static void main(String[] args) throws IOException, URISyntaxException {
        URI uri1 = Lesson4.class.getResource(fileAdd1).toURI();
        URI uri2 = Lesson4.class.getResource(fileAdd2).toURI();
        List<String> students = new ArrayList<>();
        students.addAll( Files.readAllLines(Paths.get(uri1), Charset.defaultCharset()));
        students.addAll(Files.readAllLines(Paths.get(uri2), Charset.defaultCharset()));
        System.out.println(Arrays.toString(students.toArray()));
    }
}
