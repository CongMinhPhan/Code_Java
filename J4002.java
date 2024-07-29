import java.util.*;

class lop{
    double w;
    double h;
    String color;

    public lop(int w,int h,String color){
        this.w=w;
        this.h=h;
        this.color=color;
    }

    public String getColor(){
        return color.substring(1,2).toUpperCase()+color.substring(2).toLowerCase();
    }
    public int chuvi(){
        return (int)(this.w+this.h)*2;
    }
    public int dientich(){
        return (int) (this.w*this.h);
    }

    public String toString(){
        if(h<=0 || w<=0)
            return "INVALID";
        else
            return chuvi()+" "+dientich()+" "+getColor();
    }
}

public class J4002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        lop hcn= new lop(sc.nextInt(),sc.nextInt(),sc.nextLine());
        System.out.println(hcn);
    }
}
