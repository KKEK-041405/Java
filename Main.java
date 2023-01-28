import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import packages.read;
public class Main {
  
  public static Scanner inputs;
  public static void main(String[] args) throws IOException
  {
    if(read.inputs == null){
      System.out.println(read.readinput());
    }
    while (read.inputs != null && read.inputs.hasNextLine()) {
      System.out.println(read.readinput());
    }
  }
}