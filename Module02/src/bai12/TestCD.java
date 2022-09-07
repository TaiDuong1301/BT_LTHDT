package bai12;

public class TestCD {
    public static void main(String[] args) {
        ListCD ls = new ListCD(5);
        CD cd1 = new CD("123", "Mua thu", 10, 122000);
        CD cd2 = new CD("121", "Mua ha", 10, 123000);
        CD cd3 = new CD("111", "Mua xuan", 10, 124000);
        ls.addCD(cd1);
        ls.addCD(cd2);
        ls.addCD(cd3);
        System.out.println("Ket qua");
        ls.output();

        ls.sort();
        System.out.println("Ket qua");
        ls.output();
    }
}
