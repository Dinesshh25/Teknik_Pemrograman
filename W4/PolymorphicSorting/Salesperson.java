package W4.PolymorphicSorting;

// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ************************************************************

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // Implementasi compareTo 
    public int compareTo(Object other) {
        Salesperson otherPerson = (Salesperson) other;
        
        // 1. Bandingkan berdasarkan total sales [cite: 149]
        if (this.totalSales != otherPerson.totalSales) {
            return this.totalSales - otherPerson.totalSales;
        } 
        // 2. Jika sales sama, bandingkan nama (Last Name dulu) [cite: 151]
        else {
            int nameCompare = this.lastName.compareTo(otherPerson.lastName);
            if (nameCompare != 0) return nameCompare;
            return this.firstName.compareTo(otherPerson.firstName);
        }
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSales() { return totalSales; }
}