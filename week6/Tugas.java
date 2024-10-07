package week6;

public class Tugas {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(2);

        Dosen dosen1 = new Dosen("234", "Susi", "Jl. Soehat");
        dosen1.setSKS(16);

        daftarGaji.addPegawai(dosen1);

        daftarGaji.cetakGaji();

    }
}
