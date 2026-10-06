import java.util.Scanner;

public class StudiKasus202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenis;
        int dokumen;
        int peringkat = 0;
        int pendanaan = 0;

        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/Lainnya) : ");
        jenis = input.nextLine();

        System.out.print("Jumlah dokumen : ");
        dokumen = input.nextInt();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

        } else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            pendanaan = input.nextInt();
        }

        System.out.println("\nNama mahasiswa : " + nama);
        System.out.println("Status : ");

        if (dokumen < 4) {
            System.out.println("Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {

                if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Bukan juara 1, 2, atau 3. " + "Dana penghargaan tidak diberikan.");
                }
            } else if (jenis.equalsIgnoreCase("PKM")) {
                if (pendanaan == 1) {
                    System.out.println("Tim lolos pendanaan PKM. " + "Dana penghargaan diberikan.");
                } else {
                    System.out.println("Tim tidak lolos pendanaan PKM. " + "Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Kegiatan Lainnya tidak termasuk " + "ketentuan penghargaan. " + "Dana penghargaan tidak diberikan.");
            }
        }
        input.close();
    }
}
