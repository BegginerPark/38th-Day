import java.io.PrintWriter;
import java.io.IOException;

public class PrintWrite {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("in.txt");
        for(int i = 1; i < 11; i++) {
            String data = i + " th line.";
            pw.println(data);
        }
        pw.close();

        PrintWriter pw2 = new PrintWriter("in.txt");
        for(int i = 11; i < 21; i++) {
            String data = i + " th line.";
            pw2.println(data);
        }
        pw2.close();
    }
    
}
