import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader{
    FileReader file_reader = new FileReader("compiler design//src//code.txt");
    BufferedReader br = new BufferedReader(file_reader);

    public File_Reader() throws IOException {
        System.out.println(br.readLine());
    }
}
