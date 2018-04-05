package ua.training.model;

import java.util.ArrayList;
import java.util.List;

public enum ClientDB {
    OLEG("+380634747444", "123456", "Oleg", 1987),
    DIANA("+38068989977", "234567", "Diana", 1991),
    FEDIR("+380653215698", "345678", "Fedir", 1985),
    OLENA("+380503265487", "891011", "Olena", 1995);

    private String phoneNumber;
    private String pass;
    private Tariff tariff;
    private String name;
    private int year;

    ClientDB(String phoneNumber, String pass, String name, int year) {
        this.phoneNumber = phoneNumber;
        this.pass = pass;
        this.name = name;
        this.year = year;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPass() {
        return pass;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static List<Client> fromClientDB() {
        List<Client> clients = new ArrayList<Client>();
        for(ClientDB cb : values()){
            clients.add(new Client(cb.phoneNumber, cb.pass, cb.name, cb.year));
        }
        return clients;
    }

    @Override
    public String toString() {
        return "ClientDB{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", pass='" + pass + '\'' +
                ", tariff=" + tariff.getName() +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
