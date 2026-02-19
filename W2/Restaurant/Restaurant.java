package W2.Restaurant;

public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        setStok(id, stok); 
        id++; 
    }

    public void setStok(int id, int jumlah) {
        if (jumlah >= 0) {
            this.stok[id] = jumlah;
        } else {
            System.out.println("Gagal: Stok tidak boleh negatif!");
        }
    }

    public int getStok(int id) {
        return this.stok[id];
    }

    public void pesanMenuMakanan(int idMenu, int jumlahPesan) {
        if (idMenu < id) { 
            if (stok[idMenu] >= jumlahPesan) {
                stok[idMenu] -= jumlahPesan; 
                System.out.println("Berhasil memesan: " + nama_makanan[idMenu] + " sejumlah " + jumlahPesan);
            } else {
                System.out.println("Maaf, stok " + nama_makanan[idMenu] + " tidak mencukupi!");
            }
        } else {
            System.out.println("Menu tidak ditemukan!");
        }
    }

    public void tampilMenuMakanan() {
        System.out.println("\n--- MENU RESTORAN ---");
        for (int i = 0; i < id; i++) {
            if (stok[i] > 0) {
                System.out.println(i + ". " + nama_makanan[i] + "\tRp. " + harga_makanan[i] + " [Stok: " + stok[i] + "]");
            }
        }
    }
}