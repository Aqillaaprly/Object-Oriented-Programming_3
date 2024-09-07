package week2;

public class TestBarang2 {
    public static void main(String[] args) {
        Barang2 brg1 = new Barang2();

        brg1.kode = "HP215";
        brg1.namaBarang = "Handphone";
        brg1.hargaDasar = 8900000;
        brg1.diskon = 5;
        brg1.tampilData();
    }
}