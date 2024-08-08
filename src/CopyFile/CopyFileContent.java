package CopyFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {
    public static void main(String[] args) {
        try(FileReader reader= new FileReader("src/CopyFile/source.txt")){
            try(FileWriter writer=new FileWriter("src/CopyFile/destination.txt")) {
                int character;
                while ((character = reader.read()) != -1) {
                 writer.write((char)character);

                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Completed");
    }
}