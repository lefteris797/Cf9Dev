package gr.aueb.cf.cf9.ch09;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of Java readers in the java i.o package
 */
public class FileReaders {
    public static void main(String[] args) {
    File file = new File("C:/Users/DoSoD/IdeaProjects/Cf9Dev/src/gr/aueb/cf/cf9/ch9/file.txt");
    try {
        bufferedReader(file);
    }
    catch (IOException e){
        System.out.println("Error in reading the file");
    }
    }
    public static void fileReader(String file) throws IOException{
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)){
            int bytesRead = 0;
            while ((bytesRead = fr.read()) != -1){
                System.out.print((char) bytesRead);
            }
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static void bufferedReader(File file) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(file,StandardCharsets.UTF_8))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
