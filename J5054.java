import java.util.*;

class HS{
    private String id;
    private String name;
    private float gpd;
    private String xeploai;
    private int rank;

    public HS(String name,float gpd){
        this.name=name;
        this.gpd=gpd;
    }

    public String getId(){
        return id;
    }

    public int getRank(){
        return rank;
    }

    public void setXeploai(){
        if(gpd<5){
            this.xeploai="Yeu";
        }
        else if(gpd<7){
            this.xeploai="Trung Binh";
        }
        else if(gpd<9){
            this.xeploai="Kha";
        }
        else this.xeploai="Gioi";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gpd + " " + xeploai+" "+rank;
    } 
}

public class J5054 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<HS> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new HS(String.format("HS%02d",i+1), sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine())));           
        }
        
    }
}
