package gr.aueb.cf.cf9.ch9;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.Files.writeString;

public class NioReadWrite {
    public static void main(String[] args) {
        Path source = Path.of("C:/Users/DoSoD/Downloads/nio.txt");
        Path target = Path.of("C:/Users/DoSoD/Downloads/f132fd30-d3f1-4b05-b002-7769096b7cfe.jpg");
        Path textTarget = Path.of("C:/Users/DoSoD/Downloads/nio-hello.txt");
        try {
            textWriter(textTarget);
            binaryReadWrite(source,target);
        }
        catch (IOException e){
                e.printStackTrace();
        }
    }
    public static void textWriter(Path path) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(
                path,
                "Hello Coding",
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }
    public static void textReader(Path path) throws IOException{
        Files.readString(
                path,
                StandardCharsets.UTF_8
        );
        System.out.println(path);
    }
    public static void binaryReadWrite(Path source, Path target) throws IOException{
        try (var sourceStream = Files.newInputStream(source);
             var targetStream = Files.newOutputStream(target)){
            sourceStream.transferTo(targetStream);
        }
        catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}


