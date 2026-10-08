public class CustomerQueue {

    private CustomerNode front;
    private CustomerNode rear;
    private int jumlah;

    // Constructor
    public CustomerQueue() {
        front = null;
        rear = null;
        jumlah = 0;
    }

    // Menambahkan pelanggan ke antrian
    public void enqueue(
            String nomorAntrian,
            String namaPelanggan,
            double totalBelanja) {

        CustomerNode newNode =
                new CustomerNode(
                        nomorAntrian,
                        namaPelanggan,
                        totalBelanja
                );

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        jumlah++;

        System.out.println(
                "Data pelanggan ditambahkan ke antrian!"
        );
    }

    // Menghapus pelanggan dari depan antrian
    public CustomerNode dequeue() {

        if (front == null) {
            System.out.println("Antrian kosong.");
            return null;
        }

        CustomerNode temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        temp.next = null;
        jumlah--;

        return temp;
    }

    // Menampilkan semua pelanggan
    public void display() {

        if (front == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        CustomerNode current = front;

        System.out.println("\nAntrian Pelanggan:");

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

        System.out.println("Total pelanggan: " + jumlah);
    }

    public int getJumlah() {
        return jumlah;
    }
}