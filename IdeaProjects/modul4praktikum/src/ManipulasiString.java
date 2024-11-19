import java.util.Scanner;

/**
 * @author ramahan
 * @version 1.0
 */
public class ManipulasiString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Manipulasi String ===");
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("\nPilih operasi yang ingin dilakukan:");
        System.out.println("1. Ubah menjadi huruf kapital semua");
        System.out.println("2. Ganti kata dalam kalimat");
        System.out.println("3. Balikkan kata dalam kalimat");
        System.out.print("Pilihan (1/2/3): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline

        switch (pilihan) {
            case 1:
                String kapitalSemua = ubahKapital(kalimat);
                System.out.println("Hasil: " + kapitalSemua);
                break;
            case 2:
                System.out.print("Masukkan kata yang ingin diganti: ");
                String kataLama = scanner.nextLine();
                System.out.print("Masukkan kata pengganti: ");
                String kataBaru = scanner.nextLine();
                String kalimatDiganti = gantiKata(kalimat, kataLama, kataBaru);
                System.out.println("Hasil: " + kalimatDiganti);
                break;
            case 3:
                String kalimatTerbalik = balikKata(kalimat);
                System.out.println("Hasil: " + kalimatTerbalik);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }

    /**
     * Mengubah semua huruf dalam kalimat menjadi huruf kapital.
     *
     * @parameter kalimat teks yang akan diubah
     * @return teks dalam huruf kapital semua
     */
    public static String ubahKapital(String kalimat) {
        return kalimat.toUpperCase();
    }

    /**
     * Mengganti kata tertentu dalam kalimat dengan kata baru.
     *
     * @parameter kalimat teks yang berisi kata yang akan diganti
     * @parameter kataLama kata yang ingin diganti
     * @parameter kataBaru kata pengganti
     * @return kalimat baru setelah kata diganti
     */
    public static String gantiKata(String kalimat, String kataLama, String kataBaru) {
        return kalimat.replace(kataLama, kataBaru);
    }

    /**
     * Membalikkan setiap kata dalam kalimat.
     *
     * @parameter kalimat teks yang akan dibalikkan
     * @return kalimat baru dengan setiap kata terbalik
     */
    public static String balikKata(String kalimat) {
        String[] words = kalimat.split(" ");
        StringBuilder hasilTerbalik = new StringBuilder();

        for (String word : words) {
            StringBuilder terbalik = new StringBuilder(word);
            hasilTerbalik.append(terbalik.reverse().toString()).append(" ");
        }

        return hasilTerbalik.toString().trim();
    }
}
