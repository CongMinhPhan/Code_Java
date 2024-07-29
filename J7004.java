import java.io.File;
import java.util.*;

public class J7004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new File("DATA.in"));
        Map<Integer,Integer> m=new HashMap<>();
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(m.containsKey(n)==true){
                m.put(n,m.get(n)+1);
            }
            else{
                m.put(n, 1);
            }
        }
    }
}
