package MultipleInheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;


class Manager extends Employee {
    private String secretaryName;
    private double bonus;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        // Menambahkan bonus 1/2% untuk setiap tahun masa kerja
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());

        super.raiseSalary(byPercent + bonus);
    }

@Override
    public int compare(Sortable b) {
        // Cek dulu: apakah b benar-benar seorang Manager?
        if (b instanceof Manager) {
            Manager mb = (Manager) b;
            double totalSalaryThis = this.getSalary() + this.bonus;
            double totalSalaryOther = mb.getSalary() + mb.bonus;

            if (totalSalaryThis < totalSalaryOther) return -1;
            if (totalSalaryThis > totalSalaryOther) return 1;
            return 0;
        } else if (b instanceof Employee) {
            // Jika b cuma Employee biasa, bandingkan gaji saja tanpa bonus
            return super.compare(b);
        }
        return 0;
    }
    public String getSecretaryName() {
        return secretaryName;
    }
}

