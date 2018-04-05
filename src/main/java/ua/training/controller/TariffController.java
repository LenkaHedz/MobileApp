package ua.training.controller;

import ua.training.model.Tariff;
import ua.training.model.TariffDao;
import ua.training.model.TariffDaoImpl;
import ua.training.view.View;

import java.util.List;

public class TariffController {
    private TariffDao tariff;
    private View view;

    public void begin(){
        view = new View();
        tariff = new TariffDaoImpl();
    }

    public void tariffsAll(){
        List<Tariff> tariffs = tariff.findAll();
        if(tariffs != null) {
            view.printArray(tariffs);
        }
    }

    public void tariffsByPrice(double price1, double price2){
        List<Tariff> tariffs = tariff.findByPrice(price1, price2);
        if(tariffs != null) {
            view.printArray(tariffs);
        }
    }

    public void tariffsByMinutes(double countMinutes1, double countMinutes2){
        List<Tariff> tariffs = tariff.findByMinutes(countMinutes1, countMinutes2);
        if(tariffs != null) {
            view.printArray(tariffs);
        }
    }

    public void tariffsBySms(double countSms1, double countSms2){
        List<Tariff> tariffs = tariff.findBySms(countSms1, countSms2);
        if(tariffs != null) {
            view.printArray(tariffs);
        }
    }

    public void tariffsByInternet(double countInternet1, double countInternet2){
        List<Tariff> tariffs = tariff.findByInternet(countInternet1, countInternet2);
        if(tariffs != null) {
            view.printArray(tariffs);
        }
    }

    public void tariffsByContract(boolean isContract){
        List<Tariff> tariffs = tariff.findByContract(isContract);
        if(tariffs != null) {
            view.printArray(tariffs);
        }
    }


}
