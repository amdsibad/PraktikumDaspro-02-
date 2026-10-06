import java.util.Scanner;

public class StudiKasus202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ab = new Scanner(System.in);
        Scanner cd = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String namaSiswa = sc.nextLine();
        System.out.print("Jenis Kegiatan: ");
        String kegiatan = sc.nextLine();
        

        if (kegiatan == "BELMAWA" || kegiatan == "BAKORMA" || kegiatan == "MANDIRI" || kegiatan == "belmawa" || kegiatan == "bakorma" || kegiatan == "mandiri") {

            System.out.print("Jumlah dokumen yang diupload: ");
            byte jumlahDokumen = ab.nextByte();
            System.out.print("Peringkat Juara: ");
            byte peringkat = ab.nextByte();

            if (peringkat > 0 && peringkat < 4) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Dana Penghargaan Diberikan.");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap. Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Bukan Juara 1,2,3. Dana penghargaan tidak diberikan");
            }

        } else if (kegiatan == "PKM" || kegiatan == "pkm") {

            System.out.println("Apakah lolos pendanaan? (ketik (1) jika lolos, (0) jika tidak");
            byte lolosPendanaan = cd.nextByte();

            if (lolosPendanaan == 1) {
                System.out.println("Status: Dana Penghargaan Diberikan.");
            } else {
                System.out.println("Status: Tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status: Kegiatan tidak didukung oleh dana penghargaan.");
        }
    }
}
