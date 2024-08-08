package Practice;

import java.io.FileOutputStream;

public class Practices {
    public static void main(String[] args) {
                try{
                    FileOutputStream fout=new FileOutputStream("src/Practice/text.txt");
                    fout.write(65);
                    System.out.println("success...");
                }catch(Exception e){System.out.println(e);}
            }
        }

