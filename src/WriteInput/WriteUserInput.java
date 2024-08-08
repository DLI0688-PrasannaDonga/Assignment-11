package WriteInput;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String userIn=sc.nextLine();
        try(FileWriter fr=new FileWriter  ("src/WriteInput/user_input.txt")){
            fr.write(userIn);


        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("writing completed");

    }
}
