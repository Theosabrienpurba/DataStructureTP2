public class MyLinkedList {

    private Node head;
    private int jumlahBuku;

    // Constructor
    public MyLinkedList() {
        head = null;
        jumlahBuku = 0;
    }

    // Menambahkan buku di akhir Linked List
    public void tambahBuku(String kodeBuku, String judul, String penulis) {

        Node newNode = new Node(kodeBuku, judul, penulis);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        jumlahBuku++;
        System.out.println("Data berhasil ditambahkan!");
    }

    // Menghapus buku terakhir
    public void hapusBuku() {

        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        // Jika hanya ada satu buku
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;
        }

        jumlahBuku--;
        System.out.println("Buku terakhir berhasil dihapus!");
    }

    // Mencari buku berdasarkan kode
    public void cariBuku(String kodeBuku) {

        Node current = head;

        while (current != null) {

            if (current.kodeBuku.equalsIgnoreCase(kodeBuku)) {
                System.out.println("Buku ditemukan!");
                System.out.println("Kode: " + current.kodeBuku);
                System.out.println("Judul: " + current.judul);
                System.out.println("Penulis: " + current.penulis);
                return;
            }

            current = current.next;
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // Menampilkan semua buku
    public void tampilkanSemua() {

        if (head == null) {
            System.out.println("Belum ada data buku.");
            return;
        }

        Node current = head;

        System.out.println("\nDaftar Buku:");

        while (current != null) {
            System.out.println(
                    "Kode: " + current.kodeBuku +
                            " | Judul: " + current.judul +
                            " | Penulis: " + current.penulis
            );

            current = current.next;
        }

        System.out.println("Total Buku: " + jumlahBuku);
    }

    // Mengambil jumlah buku
    public int getJumlahBuku() {
        return jumlahBuku;
    }
}