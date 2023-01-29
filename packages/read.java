package packages;
import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
public class read {
  
  public static Scanner inputs;
  
    public static String readinput()
    throws IOException{
        if(inputs == null){
            try {
                inputs = new Scanner(Path.of("io files\\input.txt"));
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
        if(inputs.hasNextLine()){
            return inputs.nextLine();
        }
        return "";
    }


}
