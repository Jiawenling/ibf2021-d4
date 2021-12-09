package fc;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CookieTest 
{
    @Test
    public void testShuffle() {
        List<String> list = Arrays.asList(new String[] { 
            "one","two","three","four","five","six",
            "seven","eight","nine","ten"
        });
        Collections.shuffle(list);
        System.out.println(list);
    }

    @Test
    public void testReadLinesFromFile() {

        String fileName = "cookie_file.txt";
        List<String> list = new ArrayList<>();

        try (Reader reader = new FileReader(fileName)) {
            BufferedReader br = new BufferedReader(reader);
            String line = "";

            while (null != (line = br.readLine())) 
                list.add(line);

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        assertTrue(list.size() == 7);
    }

    @Test
    public void ownTest() {
        String userDir= Paths.get("")
        .toAbsolutePath()
        .toString();
        System.out.println("Working directory is " + userDir);
    }
}
