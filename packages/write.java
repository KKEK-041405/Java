package packages;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.function.Function;


public class write {

    public static void output() {
        PrintStream oott = new PrintStream(System.out);
        System.setOut(new PrintStream(oott){
            @Override
            public void println(String x) {
                try {
                    FileWriter file = new FileWriter("output.txt",true);
                    
                    file.write(x+System.lineSeparator());
                    file.close();
                } catch (IOException e){
                    e.printStackTrace();
                    // TODO: handle exception
                }
            }
            @Override
            public void println(int x) {
                try {
                    FileWriter file = new FileWriter("output.txt",true);
                    
                    file.write(x+System.lineSeparator());
                    file.close();
                } catch (IOException e){
                    e.printStackTrace();
                    // TODO: handle exception
                }
            }
        });
    }
    public static void erase() {
        try {
            FileWriter file = new FileWriter("output.txt");
            file.write("");
            file.close();
        } catch (IOException e){
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
