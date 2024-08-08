package ReadDisplay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplay {
    public static void main(String[] args) {
        try(BufferedReader bf=new BufferedReader(new FileReader("src/ReadDisplay/input.txt"))) {
            String line;
            while ((line= bf.readLine())!=null){
                System.out.println(line);

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
