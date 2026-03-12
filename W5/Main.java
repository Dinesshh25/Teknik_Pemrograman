package W5;

// Interface ini pakai <T extends Comparable<T>> supaya T cuma bisa diisi 
// sama tipe data yang punya fitur buat dibandingin (punya method compareTo)
interface MinMax<T extends Comparable<T>> {
    T max();
    T min();
}

// MyClass juga ikut ngetag <T> biar sinkron sama interface-nya
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals; 
    /* Variabel vals ini array yang tipenya T (bisa angka, bisa huruf) */

    MyClass(T[] o) {
        vals = o;
        /* Konstruktor buat masukin array dari luar ke dalam variabel vals */
    }

    public T max() {
        T v = vals[0]; 
        /* Anggap dulu data pertama itu yang paling besar */

        for (int i = 1; i < vals.length; i++) {
            // Karena kita pakai 'extends Comparable', kita bisa pakai fungsi compareTo.
            // Kalau vals[i] lebih besar dari v, hasilnya bakal lebih dari 0.
            if (vals[i].compareTo(v) > 0) {
                v = vals[i]; 
                /* Update v kalau nemu yang lebih gede lagi */
            }
        }
        return v; 
        /* Balikin nilai paling maksimal yang ketemu */
    }
    

    public T min() {
        T v = vals[0]; 
        /* Anggap dulu data pertama itu yang paling kecil */

        for (int i = 1; i < vals.length; i++) {
            // Kalau vals[i] lebih kecil dari v, hasilnya bakal kurang dari 0.
            if (vals[i].compareTo(v) < 0) {
                v = vals[i]; 
                /* Update v kalau nemu yang lebih kecil lagi */
            }
        }
        return v; 
        /* Balikin nilai paling minimal yang ketemu */
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        // Bikin objek khusus buat nampung angka (Integer)
        MyClass<Integer> a = new MyClass<>(inums);
        
        // Bikin objek khusus buat nampung huruf (Character)
        MyClass<Character> b = new MyClass<>(chs);

        /* Kita pakai satu class yang sama (MyClass), tapi bisa buat nyari 
           angka terbesar sekaligus huruf paling akhir (alfabet) */
        System.out.println("Nilai Integer Terbesar: " + a.max());
        System.out.println("Karakter Terbesar: " + b.max());
        System.out.println("Nilai Integer Terkecil: " + a.min());
        System.out.println("Karakter Terkecil: " + b.min());

    }
}