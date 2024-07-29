import java.util.*;


public class J5040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<NV> l = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            l.add(new NV(i + 1, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next()));
        }
        l.forEach(System.out::println);
        sc.close();
    }
}

class NV{
    String id,ten;
    int a,b;
    String ma;

    public NV(String id,String ten,int a,int b,String ma){
        this.id=String.format("NV%02d",id);
        this.ten=ten;
        this.a=a;
        this.b=b;
        this.ma=ma;
    }
    public int h1(int a,int b){
        return a*b;
    }
    public int h2(int a,int b){
        int t=0;
        if(a>=25){
            t=(int) (h1(a, b)*0.2);
        }
        else if(22<=a){
            t=(int) (h1(a, b)*0.1);
        }
        else{
            t=0;
        }
        return t;
    }
    public int h3(String ma){
        switch (ma) {
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            case "NV":
                return 150000;
            default:
                return 0;
        }
    }
    public int h4(){
        return h1(a, b)+h2(a, b)+h3(ma);
    }
    public String toString(){
        return id+" "+ten+" "+h1(a, b)+" "+h2(a, b)+" "+h3(ma)+" "+h4();
    }
}