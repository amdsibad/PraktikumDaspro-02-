import java.util.Scanner;

public class StudiKasus102 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int kembalian;
        int kurang;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah cup: ");
        int jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang bayar: ");
        int uangBayar = sc.nextInt();
        System.out.println("Total harga: Rp. ");
        int totalHarga = sc.nextInt();
        System.out.println("Diskon: ");
        int diskon = sc.nextInt();
        System.out.println("Total bayar: ");
        int totalBayar = sc.nextInt();
    }
}
