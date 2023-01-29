import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import packages.*;
public class Main extends write {
  public static Scanner inputs;
  public static void main(String[] args) throws IOException
  {
    if(inputs == null){
      System.out.println(read.readinput());
    }
    while (inputs != null && read.inputs.hasNextLine()) {
      System.out.println(read.readinput());
    }
    output();
  }
}