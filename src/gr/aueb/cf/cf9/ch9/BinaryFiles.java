package gr.aueb.cf.cf9.ch9;

import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) {
    String inputfile = "C:/Users/DoSoD/Downloads/f132fd30-d3f1-4b05-b002-7769096b7cfe.jpg";
    String outputfile = "C:/Users/DoSoD/Downloads/f132fd30-d3f1-4b05-b002-7769096b7cfe-copy.jpg";
        try{
            BinaryFileReadWrite(inputfile, outputfile);
        }
        catch(IOException e){
            System.out.println("Copy was not succesfull");
        }
    }

    public static void BinaryFileReadWrite(String inputfile, String outputfile) throws IOException {
        final int BUFFER_SIZE = 8192;
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = 0;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputfile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputfile))) {
            while ((bytesRead = bis.read(buffer)) != -1){
                bos.write(buffer,0,bytesRead);
            }
            System.out.println("File written succesfully");
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
