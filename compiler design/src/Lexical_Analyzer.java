import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Lexical_Analyzer {
    FileReader file_reader = new FileReader("code.txt");
    BufferedReader br = new BufferedReader(file_reader);

    public Lexical_Analyzer() throws IOException {

       char c = ((char) br.read());
      
       char[] Operators = {'+','-' , '*' , '/' , '='};
       
       switch (c)
       {

       }

    }

}
