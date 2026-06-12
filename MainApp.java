package my_project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units: ");
        int units = sc.nextInt();

        Consumer c = new Consumer(id, name, units);
        TariffCalculator t = new TariffCalculator();

        double bill = t.calculateBill(c);

        System.out.println("ID: " + c.id);
        System.out.println("Name: " + c.name);
        System.out.println("Units: " + c.units);
        System.out.println("Bill: " + bill);
    }
}