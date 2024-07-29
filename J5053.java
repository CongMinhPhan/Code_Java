import java.util.*;

class DH{
    String tenhang,madh;
    long dg,sl;
    public DH(String tenhang, String madh, long dg, long sl) {
        this.tenhang=tenhang;
        this.madh=madh;
        this.dg=dg;
        this.sl=sl;
    }

    public String getNumber() {
        return madh.substring(1, 4);
    }


    public int getDiscount(){
        if(madh.endsWith("1"))
            return (int) Math.round(0.5*dg*sl);
        else if(madh.endsWith("2"))
            return (int) Math.round(0.3*dg*sl);
        return 0;
    }


    public int getMoney(){
        return (int) (dg*sl-getDiscount());
    }

    @Override
    public String toString() {
        return tenhang + " " + madh + " " +getNumber() + " " + getDiscount() + " " + getMoney();
    }



}

public class J5053 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DH> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new DH(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine())));
        }
        list.sort((a,b)->a.getNumber().compareToIgnoreCase(b.getNumber()));
        list.forEach(System.out::println);
        sc.close();
    }
}
