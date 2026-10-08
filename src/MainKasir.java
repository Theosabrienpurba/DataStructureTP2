import java.util.Scanner;

public class MainKasir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CustomerQueue queue = new CustomerQueue();
        CustomerStack stack = new CustomerStack();

        int pilihan;

        do {

            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print(
                            "Masukkan Nomor Antrian: "
                    );
                    String nomor = input.nextLine();

                    System.out.print(
                            "Masukkan Nama Pelanggan: "
                    );
                    String nama = input.nextLine();

                    System.out.print(
                            "Masukkan Total Belanja: "
                    );
                    double total = input.nextDouble();
                    input.nextLine();

                    queue.enqueue(nomor, nama, total);

                    break;

                case 2:

                    CustomerNode pelanggan =
                            queue.dequeue();

                    if (pelanggan != null) {

                        System.out.println(
                                "Melayani pelanggan " +
                                        pelanggan.nomorAntrian +
                                        " (" +
                                        pelanggan.namaPelanggan +
                                        ")"
                        );

                        stack.push(pelanggan);

                        System.out.println(
                                "Transaksi disimpan ke riwayat."
                        );
                    }

                    break;

                case 3:

                    queue.display();

                    break;

                case 4:

                    stack.display();

                    break;

                case 5:

                    System.out.println(
                            "Program selesai."
                    );

                    break;

                default:

                    System.out.println(
                            "Pilihan tidak valid!"
                    );
            }

        } while (pilihan != 5);

        input.close();
    }
}