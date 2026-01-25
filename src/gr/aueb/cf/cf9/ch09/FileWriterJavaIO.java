package gr.aueb.cf.cf9.ch09;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriterJavaIO {
    public static void main(String[] args) {
        File file = new File("C:/Users/DoSoD/IdeaProjects/Cf9Dev/src/gr/aueb/cf/cf9/ch9/file.txt");
        try {
            filewriter("C:/Users/DoSoD/IdeaProjects/Cf9Dev/src/gr/aueb/cf/cf9/ch9/file.txt");
            bufferedWriter("C:/Users/DoSoD/IdeaProjects/Cf9Dev/src/gr/aueb/cf/cf9/ch9/file.txt");
        } catch (IOException e) {
            System.out.println("File could not be created");
        }
    }

    public static void filewriter(String file) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Hello World");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedWriter(String file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8))) {
            bw.write("HelloWorld");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printStream(String file) throws IOException {
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("HelloWorld");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printWriter(String file) throws IOException {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("HelloWorld");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}