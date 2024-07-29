import java.util.Scanner;

class TS{
    String ten;
    String date;
    double a,b,c;

    public TS(String ten,String date,double a,double b,double c){
        this.ten=ten;
        this.date=date;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double tong(){
        return a+b+c;
    }

    public String toString(){
        return ten+" "+date;
    }
}

public class J4005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TS ts = new TS(sc.nextLine(), sc.nextLine(), 
        sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.format(ts + " %.1f", ts.tong());
    }
}
