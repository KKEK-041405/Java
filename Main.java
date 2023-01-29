//import packages.*;

import java.nio.file.Path;
import java.io.*;
import java.util.*;
import java.io.IOException;



public class Main {
  public static void main(String[] args) throws IOException
  {

    Scanner sc = new Scanner(System.in);
    int total_submisions = 0;
    int questions = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < questions; i++) {
      char x[] = sc.nextLine().toCharArray();
      int votes = 0;
      for (char a : x) {
        if(a == '1'){
            votes++;
        }
      }
      if(votes >= 2){
        total_submisions++;
      }
    }
    System.out.println(total_submisions);
  }
}