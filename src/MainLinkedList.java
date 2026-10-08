import java.util.Scanner;

public class MainLinkedList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MyLinkedList daftarBuku = new MyLinkedList();

        int pilihan;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan Kode Buku: ");
                    String kode = input.nextLine();

                    // Validasi kode maksimal 5 karakter
                    if (kode.length() > 5) {
                        System.out.println(
                                "Kode buku maksimal 5 karakter!"
                        );
                        break;
                    }

                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penulis: ");
                    String penulis = input.nextLine();

                    daftarBuku.tambahBuku(kode, judul, penulis);
                    break;

                case 2:
                    daftarBuku.hapusBuku();
                    break;

                case 3:
                    System.out.print("Masukkan Kode Buku: ");
                    String cari = input.nextLine();

                    daftarBuku.cariBuku(cari);
                    break;

                case 4:
                    daftarBuku.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}