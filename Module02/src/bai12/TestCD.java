package bai12_CD;

public class DemoCD {
    public static void main(String[] args) {
        CD cd1 = new CD("003", "Mua Xuan", 11, 120000);
        CD cd2 = new CD("002", "Mua Ha", 22, 450000);
        CD cd3 = new CD("001", "Mua Thu", 33, 30000);

        int n = 3;
        ListCD ls = new ListCD(n);
        ls.themCD(cd1);
        ls.themCD(cd2);
        ls.themCD(cd3);
        
        ls.inKQ();

        ls.sapXep();

        ls.inKQ();
    }
}
