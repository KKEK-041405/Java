import java.io.FileNotFoundException;
import java.io.PrintStream;

public class out {
    public static void main(String[] args) {
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(originalOut) {
            @Override
            public void println(String s) {
                super.println("[OVERRIDDEN PRINT] " + s);
            }
        });
        System.out.println("This is a test");
    }
}
