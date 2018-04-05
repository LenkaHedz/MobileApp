package ua.training.model;

import java.util.ArrayList;
import java.util.List;

public class TariffDaoImpl implements TariffDao {

    private List<Tariff> listTariff;

    public TariffDaoImpl() {
        this.listTariff = TariffDB.fromTariffDB();
    }

    public boolean addTariffInList(Tariff tariff) {
        return this.listTariff.add(tariff);
    }

    public boolean removeTariffFromList(Tariff tariff){
        return this.listTariff.remove(tariff);
    }

    public List<Tariff> findAll() {
        return this.listTariff;
    }

    public List<Tariff> findByPrice(double price1, double price2) {
        List<Tariff> tariffs = new ArrayList<Tariff>();
        for (Tariff tr: this.listTariff) {
            if(tr.getPrice() >= price1 && tr.getPrice() <= price2){
                tariffs.add(tr);
            }
        }
        return tariffs;
    }

    public List<Tariff> findByMinutes(double countMinutes1, double countMinutes2){
        List<Tariff> tariffs = new ArrayList<Tariff>();
        for (Tariff tr: this.listTariff) {
            if(tr.getCountMinutes() >= countMinutes1 && tr.getCountMinutes() <= countMinutes2){
                tariffs.add(tr);
            }
        }
        return tariffs;
    }

    public List<Tariff> findBySms(double countSms1, double countSms2){
        List<Tariff> tariffs = new ArrayList<Tariff>();
        for (Tariff tr: this.listTariff) {
            if(tr.getCountSms() >= countSms1 && tr.getCountSms() <= countSms2){
                tariffs.add(tr);
            }
        }
        return tariffs;
    }

    public List<Tariff> findByInternet(double countInternet1, double countInternet2){
        List<Tariff> tariffs = new ArrayList<Tariff>();
        for (Tariff tr: this.listTariff) {
            if(tr.getCountInternet() >= countInternet1 && tr.getCountInternet() <= countInternet2){
                tariffs.add(tr);
            }
        }
        return tariffs;
    }

    public List<Tariff> findByContract(boolean isContract) {
        List<Tariff> tariffs = new ArrayList<Tariff>();
        for (Tariff tr: this.listTariff) {
            if(tr.isContract() == isContract){
                tariffs.add(tr);
            }
        }
        return tariffs;
    }
}
