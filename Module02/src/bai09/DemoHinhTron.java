package bai09;

public class DemoHinhTron {
    public static void main(String[] args) {
        ToaDo tam = new ToaDo("P", 5, 5);
        HinhTron ht = new HinhTron(tam, 10.5);
        
        System.out.println(ht);
    }
}
