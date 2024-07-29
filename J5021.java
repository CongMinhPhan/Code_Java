import java.util.*;

public class J5021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SV> sv=new ArrayList<>();
        while(true){
            try{
                sv.add(new SV(null, null, null, null))
            }
            catch(Exception x){
                break;
            }
        }
        sv.sort((a,b)->a.ma.compareTo(b.ma));
    }
}
class SV{
    String ma,ten,lop,email;
    public SV(String ma,String ten,String lop,String email ){
        this.ma=ma;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
    }
    public String toString(){
        return ma+" "+ten+" "+" "+lop+" "+email;
    }
}