import java.util.Scanner;

class ps{
    long a,b;
    
    public ps(long a,long b){
        this.a=a;
        this.b=b;
    }
    public long gcd(long a,long b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    public String toString(){
        long x=a/gcd(a, b);
        long y=b/gcd(a, b);
        return x+"/"+y;    
    }
}


public class J4003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ps P=new ps(sc.nextInt(),sc.nextInt());
        System.out.println(P);
    }
}
