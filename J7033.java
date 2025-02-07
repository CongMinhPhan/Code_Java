import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class SinhVien {
    String maSinhVien;
    String hoTen;
    String lop;
    String email;

    void input(Scanner sc) {
        maSinhVien = sc.nextLine();
        hoTen = chuanHoa(sc.nextLine());
        lop = sc.nextLine();
        email = sc.nextLine();
    }

    String chuanHoa(String s) {
        Vector<String> a = new Vector<String>();
        String x = "";
        s = s.toLowerCase() + " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (x != "") {
                    a.add(x);
                    x = "";
                }
            } else {
                x += s.charAt(i);
            }
        }
        x = "";
        for (int i = 0; i < a.size(); i++) {
            String k = a.get(i);
            x += k.substring(0, 1).toUpperCase() + k.substring(1) + " ";
        }
        return x.substring(0, x.length() - 1);
    }

    void output() {
        System.out.printf("%s %s %s %s\n", maSinhVien, hoTen, lop, email);
    }
}

public class J7033 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        Vector<SinhVien> v = new Vector<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                if (a.maSinhVien.compareTo(b.maSinhVien) > 0)
                    return 1;
                return -1;
            }
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
        sc.close();
    }
}