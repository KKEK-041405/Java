package packages;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.function.Function;

public class write extends read {
     public static void output(ArrayList<String> output) {
        try {
            FileWriter outputfile = new FileWriter("io files\\output.txt");
            for(int i = 0;i<output.size();i++){
                outputfile.write(output.get(i)+System.lineSeparator());            
            }    
            outputfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
