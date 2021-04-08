// 파일 쓰기(text 파일을 만들고 내용 쓰기 및 추가)
// import java.io.FileOutputStream; // 파일생성
import java.io.IOException; // 예외 처리
import java.io.FileWriter;
// import java.io.PrintWriter;
// import java.io.*; // 정답은 아니다. 쓸데 없는 것 까지 다 import 하기 때문에


public class FileWrite {
    public static void main(String[] args) throws IOException {
        // FileOutputStream output = new FileOutputStream("out.text"); // text 파일 생성
        FileWriter fw = new FileWriter("out.txt");

        // text 파일 안에 내용 추가 
        for(int i = 1; i<11; i++) {
            String data = i +" th line. \r\n"; // \r\n 은 줄바꿈 문자이다.
            // pw.println(data); // println 을 사용하면 자동으로 줄을 바꾸어 준다.
            fw.write(data);
        }
        fw.close(); // 닫아 주기

        // FileWriter 로 내용 추가
        FileWriter fw2 = new FileWriter("out.txt", true);
        for (int i = 11; i < 21; i++) {
            String data = i + " th line. \r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
