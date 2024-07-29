import java.util.*;
public class J03004 {
    public static String chuanhoa(String s){
        String s0 = s.substring(0, 1);
        s0 =s0.toUpperCase();
        String s1=s.substring(1, s.length());
        String s2=s0+s1;
        return s2;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            s=sc.nextLine();
            s=s.trim().toLowerCase();
                s = s.replaceAll("\\s+", " ");
            String[] s1=s.split(" ");
            for(int i=0;i<s1.length;i++){
                System.out.print(chuanhoa(s1[i]+" "));
            }
            System.out.println();
        }
    }
}
