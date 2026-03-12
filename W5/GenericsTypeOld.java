package W5;

public class GenericsTypeOld {

    private Object t; 
    /* Variabel t pakai tipe Object supaya bisa menampung data apa saja (bebas) */

    public Object get() {
        return t; 
        /* Fungsi ini buat ambil data yang ada di t */
    }

    public void set(Object t) {
        this.t = t; 
        /* Fungsi ini buat naruh data ke t. Pakai 'this' biar nggak bingung sama nama parameter */
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld(); 
        /* Bikin objek baru namanya 'type' supaya kelas ini bisa dipakai */

        type.set("Java"); 
        /* Masukin tulisan "Java" ke dalam set */

        String str = (String) type.get(); 
        /* Ambil data t, tapi harus dipaksa jadi String pakai (String) biar bisa masuk ke variabel str */
        
        System.out.println(str);
    }
}