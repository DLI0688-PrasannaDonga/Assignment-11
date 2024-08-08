package CountWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/CountWords/text_file"))) {
            String reader;
            int count=0;
            while ((reader = br.readLine()) != null) {

                String[] words = reader.split("\\s+");
                count += words.length;
            }

            System.out.println("Count of words in file is : "+count);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
