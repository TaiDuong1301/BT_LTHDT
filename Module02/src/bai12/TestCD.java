package bai12_CD;

import java.util.Scanner;

public class TestCD {
    public static CD nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma CD: ");
        String ma = sc.nextLine();
        System.out.println("Nhap tua bai: ");
        String tua = sc.nextLine();
        System.out.println("Nhap so bai hat: ");
        int sb = sc.nextInt();
        System.out.println("Nhap gia thanh: ");
        double gt = sc.nextDouble();
        sc.close();
        CD cdr = new CD(ma, tua, sb, gt);

        return cdr;
    }

    public static void main(String[] args) {
        int n = 5;
        ListCD ls = new ListCD(n);

        CD cd1 = new CD("003", "Mua Xuan", 11, 120000);
        CD cd2 = new CD("002", "Mua Ha", 22, 450000);
        CD cd3 = new CD("001", "Mua Thu", 33, 30000);

        ls.themCD(cd1);
        ls.themCD(cd2);
        ls.themCD(cd3);
        ls.themCD(nhap());
        
        ls.inKQ();

        ls.sapXep();

        ls.inKQ();
        
        CD cd4 = new CD("004", "Mua Dong", 33, 30000);
        ls.themCD(cd4);

        ls.inKQ();
    }
}
