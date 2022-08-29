package bai05;

public class DemoTamGiac {
    public static void main(String[] args) {
        TamGiac triangle1 = new TamGiac(0f, 0f, 0f);
        TamGiac triangle2 = new TamGiac(-2f, -4f, -6f);
        TamGiac triangle3 = new TamGiac(3f, 6f, 4f);
        TamGiac triangle4 = new TamGiac(4f, 4f, 6f);
        TamGiac triangle5 = new TamGiac(10f,10f,10f);

        System.out.println(String.format("%6s %6s %6s %-20s %6s %6s", "Canh A", "Canh B", "Canh C", "Kieu tam giac", "Chu vi", "Dien tich"));
        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle3);
        System.out.println(triangle4);
        System.out.println(triangle5);
    }
}
