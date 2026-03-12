package W5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Wildcard Arguments With An Unknown Type
 * @author javaguides.net
 **/
public class WildCardSimpleExample {

    // Tanda <?> disebut Wildcard. Artinya method ini bisa nerima Collection 
    // isi apa saja (String, Integer, atau objek lain) tanpa protes.
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
            /* Karena tipenya pakai '?', Java otomatis menganggap isinya adalah Object.
               Makanya kita pakai 'Object e' buat ngambil datanya. */
        }
    }

    public static void main(String[] args) {
        // Bikin koleksi pakai ArrayList (List yang urut)
        Collection<String> collection = new ArrayList<>();
        collection.add("ArrayList Collection");
        printCollection(collection);

        // Bikin koleksi pakai LinkedList (List yang nyambung satu-satu)
        Collection<String> collection2 = new LinkedList<>();
        collection2.add("LinkedList Collection");
        printCollection(collection2);

        // Bikin koleksi pakai HashSet (Set yang unik, nggak urut)
        Collection<String> collection3 = new HashSet<>();
        collection3.add("HashSet Collection");
        printCollection(collection3);
    }

    /* Pelajarannya: printCollection bisa nerima ketiganya walaupun jenis 
           koleksinya beda-beda (ArrayList, LinkedList, HashSet). */
}
