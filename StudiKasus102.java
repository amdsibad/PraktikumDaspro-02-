import java.util.Scanner;

public class StudiKasus102 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int kembalian;
        int kurang;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup: ");
        int jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        int uangBayar = sc.nextInt();

        int totalHarga;
        int diskon;
        int totalBayar;

        totalHarga = jumlahCup * hargaPerCup;
        if (uangBayar >= 100000) {
            System.out.println("\nTotal harga: Rp. " + totalHarga);
            diskon = totalHarga * 10 / 100;
            System.out.println("Diskon: Rp. " + diskon);
        } else {
            System.out.println("Total harga: Rp. " + totalHarga);
            diskon = 0;
            System.out.println("Diskon: Rp. " + diskon);
        }

        totalBayar = totalHarga - diskon;
        System.out.println("\nTotal bayar: Rp. " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian Anda Rp. " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang Anda tidak cukup, kurang Rp. " + kurang);
        }
    }
}
