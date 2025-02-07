import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J7040 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> l = (ArrayList<String>) ois.readObject();
        Set<String> s = new TreeSet<>();
        for (String i : l) {
            String[] words = i.trim().toLowerCase().split("\\s+");
            s.addAll(Arrays.asList(words));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String x = sc.next().toLowerCase();
            if (s.contains(x)) {
                System.out.println(x);
                s.remove(x);
            }
        }
    }
}