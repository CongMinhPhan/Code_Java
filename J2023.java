import java.util.Scanner;

public class J2023 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<a;i++){
            if(i<b){
                System.out.println(i);
            }
        }
    }
}
