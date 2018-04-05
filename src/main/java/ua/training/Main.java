package ua.training;

import ua.training.controller.TariffController;

public class Main {
    public static void main(String[] args) {

        TariffController tc = new TariffController();
        tc.begin();
        tc.tariffsAll();
        System.out.println("--------------------");
        tc.tariffsByPrice(40, 50);
        System.out.println("--------------------");
        tc.tariffsByInternet(0, 0);
        System.out.println("--------------------");
        tc.tariffsByMinutes(100, 150);
        System.out.println("--------------------");
        tc.tariffsBySms(0, 0);
        System.out.println("--------------------");
        tc.tariffsByContract(true);

       /* System.out.println("Menu by price:");
        tariff.menuByPrice(100, 200);

        System.out.println("Menu by discount:");
        tariff.menuByDiscount();

        System.out.println("Order to 1 kilo:");
        tariff.orderByWeight(1000);

        tariff.end();*/

    }
}
