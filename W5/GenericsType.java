package W5;

public class GenericsType<T> {

    private T t;
    /* Variabel t sekarang pakai tipe T (Generic). Artinya tipe datanya bakal 
       ngetag/ngikut sesuai apa yang kita minta waktu bikin objek nanti. */

    public T get() {
        return this.t;
        /* Fungsi buat ambil data t. Hasilnya otomatis tipenya pas, nggak perlu dipaksa (casting) lagi */
    }

    public void set(T t1) {
        this.t = t1;
        /* Fungsi buat naruh data ke t. Java bakal jagain supaya data yang masuk tipenya benar */
    }

    public static void main(String args[]) {
        // 1. CARA MODERN (Safe)
        GenericsType<String> type = new GenericsType<>();
        /* Kita pesen wadah yang khusus buat String. Jadi Java tahu t itu isinya pasti tulisan. */
        
        type.set("Java"); // Valid karena String
        System.out.println(type.get()); // Langsung ambil tanpa perlu (String) lagi

        // 2. CARA LAMA (Raw Type - Kurang disarankan)
        GenericsType type1 = new GenericsType(); 
        /* Kalau nggak dikasih <T>, dia balik lagi jadi kayak 'Object' (bebas isi apa aja) */
        
        type1.set("Java"); // Bisa isi tulisan
        type1.set(10);     // Bisa isi angka (Integer) karena dukungan autoboxing
        
        GenericsType type2 = new GenericsType();
        type2.set(10.5);   // Bisa isi desimal (Double)
        
        System.out.println(type1.get());
        System.out.println(type2.get());
    }
}