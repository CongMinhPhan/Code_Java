import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J7001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        long d=0;
        while(sc.hasNextLine()){
            String s=sc.next();
            d+=Integer.parseInt(s);
            System.out.print(d);
        }
    }
}
