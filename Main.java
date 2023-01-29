import java.io.IOException;
import java.util.*;

import packages.*;
public class Main extends function {
  public static void main(String[] args) throws IOException
  {
    ArrayList<String> output = new ArrayList<String>();
    if(inputs == null){
      output.add(work(readinput()));
    }
    while (inputs != null && inputs.hasNextLine()) {

      output.add(work(readinput()));
    }
    
    output(output);
    }   
  
}