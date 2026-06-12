package my_project;

public class TariffCalculator {

    double calculateBill(Consumer c) {
        double bill = 0;

        if (c.units <= 100)
            bill = c.units * 1.5;
        else if (c.units <= 200)
            bill = 100 * 1.5 + (c.units - 100) * 2.5;
        else if (c.units <= 300)
            bill = 100 * 1.5 + 100 * 2.5 + (c.units - 200) * 4;
        else
            bill = 100 * 1.5 + 100 * 2.5 + 100 * 4 + (c.units - 300) * 6;

        return bill;
    }
}