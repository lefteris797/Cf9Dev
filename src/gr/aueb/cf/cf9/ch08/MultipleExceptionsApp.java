package gr.aueb.cf.cf9.ch08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {
    public static void main(String[] args) {
        File file = new File("test.txt");
        char ch = ' ';
        try (Scanner scanner = new Scanner(file)){
            ch = (char) System.in.read();
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("IO exception");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("something went wrong");
            e.printStackTrace();
        }
    }
}
