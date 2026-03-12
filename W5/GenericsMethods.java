package W5;

public class GenericsMethods {
 
    // Di sini kita bikin method generic. Tanda <T> sebelum return type (boolean) 
    // itu buat ngasih tahu Java kalau method ini bakal pakai tipe data fleksibel T.
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.get().equals(g2.get());
        /* Method ini tugasnya bandingin isi dari dua objek GenericsType. 
           Karena pakai <T>, g1 dan g2 harus punya tipe data yang sama. */
    }
 
    public static void main(String args[]) {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");
 
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");
 
        //  Kita sebutin <String> di tengah-tengah buat mastiin tipenya.
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
 
        // (Type Inference)
        // Karena g1 dan g2 itu isinya String, Java otomatis tahu kalau T itu String.
        isEqual = GenericsMethods.isEqual(g1, g2);
        
        System.out.println("Apakah sama? " + isEqual);
    }
}