import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("Win");    
        } else if (a == 2) {
            System.out.println("Lose");
        } else if (a == 3) {
            System.out.println("Tie");
        }
    }
}

