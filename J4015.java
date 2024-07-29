import java.util.Scanner;
import java.util.*;
public class J4015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GV gv =new GV(sc.nextLine(),sc.nextLine(),sc.nextInt());
        System.out.println(gv);
    }
}
class GV{
    String ma,ten;
    int a;
    public GV(String ma,String ten,int a){
        this.ma=ma;
        this.ten=ten;
        this.a=a;
    }
    public int h1(){
        int b;
        b = (ma.charAt(2) - '0') * 10 + ma.charAt(3) - '0';
        return b;
    }
    public int h2(){
        switch (ma.substring(0,2)) {
            case "HT":
                return 2000000;
            case "HP":
                return 900000;
            case "GV":
                return 500000;
            default:
                return 0;
        }
    }
    public int h3(){
        return a*h1()+h2();
    }

    public String toString(){
        return ma+" "+ten+" "+h1()+" "+h2()+" "+h3();
    }
}
