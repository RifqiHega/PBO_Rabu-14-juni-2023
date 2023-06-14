package Practice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        SavingAccount user01 = new SavingAccount("Bagas", 10000, 0.05);
        user01.hitungBunga();
        user01.hitungdeposit(10000);

        SavingAccount user02 = new SavingAccount("Udin", 20000, 0.025);
        user02.hitungBunga();
        user02.hitungdeposit(20000);

        System.out.println("User 01");
        user01.displayInfo();

        System.out.println("User 02");
        user02.displayInfo();

        System.out.println("Apakah Anda Ingin Menyimpan Data ini?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Masukkan Jawaban : ");
        int pilihan = scanner.nextInt();

        String file;
        if (pilihan == 1 ){

            System.out.print("Masukkan Nama File : ");
            file = scanner.next();
            System.out.println("Check");

            FileWriter fileWriter = new FileWriter(file+".txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);


            printWriter.println("User 01");
            printWriter.println("Nama              : " + user01.getNama());
            printWriter.println("Balance           : " + user01.getBalance());
            printWriter.println("Interestrate      : " + user01.getInterestRate());
            printWriter.println("Bunga             : " + user01.getBunga());
            printWriter.println("Deposit           : " + user01.getDeposit());
            printWriter.println();
            printWriter.println("User 02");
            printWriter.println("Nama              : " + user02.getNama());
            printWriter.println("Balance           : " + user02.getBalance());
            printWriter.println("Interestrate      : " + user02.getInterestRate());
            printWriter.println("Bunga             : " + user02.getBunga());
            printWriter.println("Deposit           : " + user02.getDeposit());
            printWriter.close();

        } else {

        }






    }

}
