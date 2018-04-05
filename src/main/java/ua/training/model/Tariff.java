package ua.training.model;

public class Tariff {
    private long id;
    private String name;
    private double price;
    private int countMinutes;
    private int countSms;
    private int countInternet;
    private boolean isContract;

    public Tariff() {
    }

    public Tariff(long id, String name, double price, int countMinutes, int countSms, int countInternet, boolean isContract) {
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

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCountMinutes() {
        return countMinutes;
    }

    public void setCountMinutes(int countMinutes) {
        this.countMinutes = countMinutes;
    }

    public int getCountSms() {
        return countSms;
    }

    public void setCountSms(int countSms) {
        this.countSms = countSms;
    }

    public int getCountInternet() {
        return countInternet;
    }

    public void setCountInternet(int countInternet) {
        this.countInternet = countInternet;
    }

    public boolean isContract() {
        return isContract;
    }

    public void setContract(boolean contract) {
        isContract = contract;
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
