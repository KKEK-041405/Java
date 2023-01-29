package packages;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.*;;

public class Scanner extends write {
    public static java.util.Scanner inputs;
    public static InputStream system;
    public static java.util.Scanner sc;
    public Scanner(InputStream scanner){
        erase();
        output();
        system = scanner;        
    }
    
    public static String nextLine()
    throws IOException{
        if(inputs == null){
            try {
                inputs = new java.util.Scanner(Path.of("input.txt"));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }

        if(inputs.hasNextLine()){
           return inputs.nextLine();
        }
        else{
            java.util.Scanner inpsljfkjs = new java.util.Scanner(System.in);
            System.out.print(">>");;
            return inpsljfkjs.nextLine();
        }
        
    }

    
}

/*
import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class read extends Scanner{
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in) {
        @Override
        public String nextLine() {
            String input = super.nextLine();
            System.out.println("[OVERRIDDEN NEXTLINE] " + input);
            return input;
        }
    };
}
    


}
*/