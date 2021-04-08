import java.io.FileWriter;
// import java.io.PrintWriter;
import java.io.IOException;

public class Quiz {
    public static void main(String[] args) throws IOException{
        FileWriter odd = new FileWriter("odd.txt");
        for(int i = 0; i < 101; i++) {
            if (i % 2 == 1){
                String data = i + " \r\n";
                odd.write(data);
            }
    }
    odd.close();
}
    // PrintWriter pw = new PrintWriter("odd.txt");
    // for (int i = 0; i < 100; i++) {
    //     if (i % 2 == 1){
    //         String data = i + " ";
    //         pw.println(data);
    //     }
    // }
    // pw.close();
}