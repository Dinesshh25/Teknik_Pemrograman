package W5;

/* T extends A artinya T cuma boleh diisi sama kelas A atau anak-anaknya (B dan C).
   Ini biar Java yakin kalau semua data yang masuk pasti punya fungsi displayClass() */
class Bound<T extends A> {
 
    private T objRef;
 
    public Bound(T obj) {
        this.objRef = obj;
    }
 
    public void doRunTest() {
        this.objRef.displayClass();
        /* Karena kita sudah ngetag 'extends A', Java bolehin kita panggil displayClass() 
           tanpa takut error, karena A punya fungsi itu */
    }
}
 
class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}
 
class B extends A {
    /* B itu anaknya A, jadi dia punya semua yang A punya tapi isinya diganti (Override) */
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}
 
class C extends A {
    /* C juga anaknya A, tapi punya isi display sendiri */
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}
 
public class BoundedClass {
 
    public static void main(String a[]) {
 
        // Bikin wadah Bound khusus buat tipe C
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();
 
        // Bikin wadah Bound khusus buat tipe B
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest();
 
        // Bikin wadah Bound buat induknya sendiri (A)
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();
        
        /* Coba deh masukin String ke Bound, pasti Java bakal protes karena 
           String bukan keluarga dari kelas A */
    }
}