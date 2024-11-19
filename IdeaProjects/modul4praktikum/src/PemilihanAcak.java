import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ramahan
 * @version 1.0
 */

public class PemilihanAcak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("-- Program Pemilihan Acak --");
        System.out.println("1. Pilih angka acak");
        System.out.println("2. Pilih kata acak");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan batas bawah angka: ");
                int batasBawah = scanner.nextInt();
                System.out.print("Masukkan batas atas angka: ");
                int batasAtas = scanner.nextInt();

                int angkaAcak = pilihAngkaAcak(batasBawah, batasAtas, random);
                System.out.println("Angka acak yang dipilih: " + angkaAcak);
                break;

            case 2:
                System.out.print("Berapa jumlah kata yang ingin dimasukkan? ");
                int jumlahKata = scanner.nextInt();
                scanner.nextLine(); // Bersihkan newline

                List<String> kataList = new ArrayList<>();
                for (int i = 1; i <= jumlahKata; i++) {
                    System.out.print("Masukkan kata ke-" + i + ": ");
                    kataList.add(scanner.nextLine());
                }

                String kataAcak = pilihKataAcak(kataList, random);
                System.out.println("Kata acak yang dipilih: " + kataAcak);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }

    /**
     * Memilih angka acak antara batas bawah dan batas atas yang diberikan.
     *
     * @parameter batasBawah batas bawah dari rentang angka acak
     * @parameter batasAtas batas atas dari rentang angka acak
     * @parameter random objek Random untuk menghasilkan angka acak
     * @return angka acak dalam rentang batasBawah hingga batasAtas (inklusif)
     */
    public static int pilihAngkaAcak(int batasBawah, int batasAtas, Random random) {
        return random.nextInt(batasAtas - batasBawah + 1) + batasBawah;
    }

    /**
     * Memilih kata acak dari daftar kata yang diberikan.
     *
     * @parameter kataList daftar kata yang akan dipilih secara acak
     * @parameter random objek Random untuk memilih indeks secara acak
     * @return kata acak dari daftar kata
     */
    public static String pilihKataAcak(List<String> kataList, Random random) {
        int indeksAcak = random.nextInt(kataList.size());
        return kataList.get(indeksAcak);
    }
}
