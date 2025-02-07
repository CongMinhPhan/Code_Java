import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J7032 {

    public static boolean check(String s) {
        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i <= s.length() / 2; i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        int[] f1 = new int[1000001];
        int[] f2 = new int[1000001];
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> a = (ArrayList<Integer>) ois.readObject();
        for (Integer x : a) {
            if (check(x.toString())) {
                f1[x]++;
            }
        }
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        a = (ArrayList<Integer>) ois.readObject();
        for (Integer x : a) {
            if (check(x.toString())) {
                f2[x]++;
            }
        }
        int s = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (f1[i] > 0 && f2[i] > 0) {
                System.out.println(i + " " + (f1[i] + f2[i]));
                s++;
            }
            if (s == 10) {
                break;
            }
        }
    }
}