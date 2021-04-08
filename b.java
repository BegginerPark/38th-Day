import java.util.*;


public class b {
    public static void main(String[] args) {
        System.out.print("input find data: ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        
        int[] arr = {11,13,17,19,23,29,31};
        Bsearch(arr, search);
    }

    public static void Bsearch(int[] arr, int search) {
        int head = 0; // 처음
        int tail = arr.length -1; // 끝 
        int center;
        
        while (head <= tail) {
            center = (head + tail)/2;
            if (arr[center] == search) {
                System.out.println(center + " is same as search");
                break;
            }
            if (arr[center] < search) {
                head = center + 1;
            } else {
                tail = center-1 ;
            }

            if (head > tail) {
                System.out.println("cannot found the search number");
                break;
            } 
        }
    }
}
