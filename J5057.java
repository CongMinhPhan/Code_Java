import java.util.*;


class TS{
    String ma;
    String name
    ,status;
    float d1,d2,d3;

    public TS(String ma,String name,float d1,float d2,float d3){
        this.ma=ma;
        this.name=format(name);
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }

    public String format(String name){
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++)
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
        return String.join(" ", list);
    }
    //chuan hoa
    private String diemut() {
        switch (ma.substring(2, 3)) {
            case "1":
                return "0.5";
            case "2":
                return "1";
            default:
                return "2.5";
        }
    }
    public String tong() {
        double d = d1 * 2 + d2 + d3;
        if (d + Double.parseDouble(diemut()) >= 24)
            status = "TRUNG TUYEN";
        else
            status = "TRUOT";
        if (d == (int) d)
            return Integer.toString((int) d);
        return String.format("%.1f", d);
    }


    public String toString(){
        return ma+" "+name+" "+diemut()+" "+tong()+" "+status;
    }
}

public class J5057 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<TS> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new TS(sc.nextLine(),sc.nextLine(),
            Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
    
        list.forEach(System.out::println);
        sc.close();
    }
}