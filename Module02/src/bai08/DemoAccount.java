package bai08;

public class DemoAccount {
    public static void main(String[] args) {
        Account acc1 = new Account(72354, "Ted Murphy", 100000);
        Account acc2 = new Account(69731, "Jane Smith", 40000);
        Account acc3 = new Account(93757, "Edward Demsey", 700000);

        System.out.println("Gui them tien cho acc1 la 250000");
        System.out.println(acc1.deposit(250000) ? "Thanh cong" : "That bai");
        System.out.println("Gui tien cho acc 2 la 500000");
        System.out.println(acc2.deposit(500000) ? "Thanh cong" : "That bai");
        System.out.println("Rut khoi acc2 so tien la 430000, muc phi 2000");
        System.out.println(acc2.withdraw(430000, 2000) ? "Thanh cong" : "That bai");
        System.out.println("Tinh tien lai cho acc3");
        acc3.addInterest();
        System.out.println("Tien lai acc3: " + acc3.getBalance());

        System.out.println("Thong tin acc1: ");
        System.out.println(acc1);
        System.out.println("Thong tin acc2: ");
        System.out.println(acc2);
    }
}
