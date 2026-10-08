public class CustomerStack {

    private CustomerNode top;

    // Constructor
    public CustomerStack() {
        top = null;
    }

    // Menambahkan transaksi ke stack
    public void push(CustomerNode data) {

        data.next = top;
        top = data;
    }

    // Menampilkan transaksi terbaru ke lama
    public void display() {

        if (top == null) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }

        CustomerNode current = top;

        System.out.println("\nRiwayat Transaksi:");

        while (current != null) {

            System.out.println(
                    current.nomorAntrian +
                            " | " +
                            current.namaPelanggan +
                            " | Rp" +
                            current.totalBelanja
            );

            current = current.next;
        }
    }
}