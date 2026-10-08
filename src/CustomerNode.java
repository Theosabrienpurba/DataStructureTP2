public class CustomerNode {

    String nomorAntrian;
    String namaPelanggan;
    double totalBelanja;
    CustomerNode next;

    // Constructor
    public CustomerNode(
            String nomorAntrian,
            String namaPelanggan,
            double totalBelanja) {

        this.nomorAntrian = nomorAntrian;
        this.namaPelanggan = namaPelanggan;
        this.totalBelanja = totalBelanja;
        this.next = null;
    }
}