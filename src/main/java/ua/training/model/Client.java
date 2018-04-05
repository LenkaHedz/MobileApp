package ua.training.model;

public class Client {
    private String phoneNumber;
    private String pass;
    private Tariff tariff;
    private String name;
    private int year;

    public Client() {
    }

    public Client(String phoneNumber, String pass, String name) {
        this.phoneNumber = phoneNumber;
        this.pass = pass;
        this.name = name;
    }

    public Client(String phoneNumber, String pass, Tariff tariff, String name) {
        this.phoneNumber = phoneNumber;
        this.pass = pass;
        this.tariff = tariff;
        this.name = name;
    }

    public Client(String phoneNumber, String pass, String name, int year) {
        this.phoneNumber = phoneNumber;
        this.pass = pass;
        this.name = name;
        this.year = year;
    }

    public Client(String phoneNumber, String pass, Tariff tariff, String name, int year) {
        this.phoneNumber = phoneNumber;
        this.pass = pass;
        this.tariff = tariff;
        this.name = name;
        this.year = year;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Client{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", pass='" + pass + '\'' +
                ", tariff=" + tariff.getName() +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
