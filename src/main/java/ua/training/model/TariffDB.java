package ua.training.model;

import java.util.*;

public enum TariffDB {
    SUBSIDY(100, "Subsidy", 35.00, 35, 0, 0, false),
    LIFEHACK(200, "Lifehuck", 45.00, 50, 100, 250, false),
    HYPE(300, "Lifehuck", 75.00, 100, 100, 2000, false),
    POTIMAL(400, "Optimal", 50.00, 60, 50, 500, true);

    private long id;
    private String name;
    private double price;
    private int countMinutes;
    private int countSms;
    private int countInternet;
    private boolean isContract;

    TariffDB(long id, String name, double price, int countMinutes, int countSms, int countInternet, boolean isContract) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.countMinutes = countMinutes;
        this.countSms = countSms;
        this.countInternet = countInternet;
        this.isContract = isContract;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCountMinutes() {
        return countMinutes;
    }

    public int getCountSms() {
        return countSms;
    }

    public int getCountInternet() {
        return countInternet;
    }

    public boolean isContract() {
        return isContract;
    }

    public static List<Tariff> fromTariffDB() {
        List<Tariff> tariffs = new ArrayList<Tariff>();
        for(TariffDB tb : values()){
            tariffs.add(new Tariff(tb.id, tb.name, tb.price, tb.countMinutes, tb.countSms, tb.countInternet, tb.isContract));
        }
        return tariffs;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", countMinutes=" + countMinutes +
                ", countSms=" + countSms +
                ", countInternet=" + countInternet +
                ", isContract=" + isContract +
                '}';
    }

}
