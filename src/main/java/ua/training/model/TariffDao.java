package ua.training.model;

import java.util.List;

public interface TariffDao {
    List<Tariff>findAll();
    List<Tariff>findByPrice(double price1, double price2);
    List<Tariff>findByMinutes(double countMinutes1, double countMinutes2);
    List<Tariff>findBySms(double countSms1, double countSms2);
    List<Tariff>findByInternet(double countInternet1, double countInternet2);
    List<Tariff>findByContract(boolean isContract);
}
