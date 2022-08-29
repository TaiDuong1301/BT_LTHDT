package bai08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035; // final variable : const
    /**
     * Constructor
     */
    public Account() {
        accountNumber = 999999;
        name = "Chua xac dinh";
        balance = 50000;
    }
    public Account(long accountNumber, String name, double balance) {
        setAccountNumber(accountNumber);
        setName(name);
        setBalance(balance);
    }
    public Account(long accountNumber, String name) {
        setAccountNumber(accountNumber);
        setName(name);
        setBalance(0);
    }
    /**
     * Getter & Setter
     */
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber > 0 ? accountNumber : 999999;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.equals("") ? "Chua xac dinh" : name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance >= 50000 ? balance : 50000;
    }
    public double getRATE() {
        return RATE;
    }
    /**
     * other Methods
     */

    /**
     * Gửi tiền
     * @param amount
     * @return
     */
    public boolean deposit(double amount) {
        // return amount > 0 ? true : false;
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    /**
     * Rút tiền 
     * @param amount
     * @param fee
     * @return
     */
    public boolean withdraw(double amount, double fee) {
        //return (amount > 0) && (amount + fee <= balance) ? true : false;
        if ((amount > 0) && (amount + fee <= balance)) {
            balance -= amount + fee;
            return true;
        }
        return false;
    }
    /**
     * Tính tiền lãi
     */
    public void addInterest() {
        balance = balance + balance * RATE;
    }
    /**
     * Chuyển tiền từ acc này sang acc khác 
     * @param acc
     * @param amount
     * @return
     */
    public boolean transfer(Account acc, double amount) {
        if (balance - amount >= 0) {
            acc.balance += amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        Locale local = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(local);
        return "Account [accountNumber=" + accountNumber + ", balance=" + nf.format(balance) + ", name=" + name + "]";
    }
    
}
