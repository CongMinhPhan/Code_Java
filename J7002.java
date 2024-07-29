import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J7002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long d = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                d += Integer.parseInt(s);
            } catch (Exception x) {
            }
        }
        System.out.print(d);
    }
}