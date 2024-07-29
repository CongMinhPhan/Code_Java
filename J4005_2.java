import java.util.*;

public class J4005_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TS A=new TS(null, null, 0, 0, 0);
    }
}
class TS{
    String name,date;
    float a,b,c;

    public TS(String name,String date,float a,float b,float c){
        this.name=name;
        this.date=date;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public float tong(float a,float b,float c){
        return a+b+c;
    }
    public String toString(){
        return name+" "+date+" "+tong(a,b,c);
    }
}