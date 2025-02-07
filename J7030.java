import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J7030 {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> al1 = (ArrayList<Integer>) ois.readObject();
        Set<Integer> ts1 = new TreeSet<>();
        for (int i : al1) {
            if (isPrime(i)) {
                ts1.add(i);
            }
        }

        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> al2 = (ArrayList<Integer>) ois.readObject();
        Set<Integer> ts2 = new TreeSet<>();
        for (int i : al2) {
            if (isPrime(i)) {
                ts2.add(i);
            }
        }

        for (Integer i : ts1) {
            if (i >= 1000000 - i) {
                break;
            }
            if (ts2.contains(1000000 - i)) {
                System.out.println(i + " " + (1000000 - i));
            }
        }
        ois.close();
    }
}