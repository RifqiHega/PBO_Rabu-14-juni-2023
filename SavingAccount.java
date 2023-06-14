package Practice;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class SavingAccount {
    private double balance;
    private double interestRate;
    private String nama;
    public double deposit;

    public double bunga;
    Scanner scanner = new Scanner(System.in);

    public String getNama() {
        return nama;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getBunga() {
        return bunga;
    }

    public double getDeposit() {
        return deposit;
    }

    public SavingAccount (String nama, double balance, double interestRate){
        this.nama = nama;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public  void displayInfo(){
        System.out.println("Nama         : "+ nama);
        System.out.println("Balance      : "+ balance);
        System.out.println("Interestrate : "+ interestRate);
        System.out.println("Bunga        : "+ bunga);
        System.out.println("Deposit      : "+ deposit);
    }

    public  void hitungdeposit(int cash){
        deposit = balance+(balance*interestRate)+cash;
    }

    public void hitungBunga() {
        bunga = balance*interestRate / 100;
    }


}
