package W2.Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        
        menu.tambahMenuMakanan("Pizza", 250000, 10);
        menu.tambahMenuMakanan("Spaghetti", 80000, 5);
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 2);

        menu.tampilMenuMakanan();


        System.out.println("\n--- Proses Pemesanan ---");
        menu.pesanMenuMakanan(0, 4);  
        menu.pesanMenuMakanan(2, 5);  
        
        menu.tampilMenuMakanan();
    }
}