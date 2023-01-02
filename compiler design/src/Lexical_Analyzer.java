import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Lexical_Analyzer {
    FileReader file_reader = new FileReader("code.txt");
    BufferedReader br = new BufferedReader(file_reader);

    public Lexical_Analyzer() throws IOException {

       char c = ((char) br.read());
      
       char[] Operators = {'+','-' , '*' , '/' , '='};


     int i;
        BufferedReader bufferedReader;
        while(( i=bufferedReader.read())!=-1){
            System.out.print((char)i);

            for (int j =0; j<Operators.length;j++){
                char g =Operators[j];
                if((char)i==g){

                }
            }
            if (Character.isDigit((char)i)){

            }
            else{

            }

    }

}
}