import java.util.Scanner;

public class J3031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int x = 0, k = sc.nextInt();
            int a[] = new int[200];
            for (int i = 0; i < s.length(); i++){
                a[s.charAt(i)]++;
            }
            for (int i = 0; i < 200; i++)
                if (a[i] > 0)
                System.out.println(i);
        }
    }
}
