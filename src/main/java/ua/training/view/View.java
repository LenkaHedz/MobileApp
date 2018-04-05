package ua.training.view;

import ua.training.model.Tariff;

import java.util.List;

public class View {

    public void print(String message) {
        System.out.println(message);
    }

    public void printArray(List<Tariff> tariffs){
        for (Tariff tr : tariffs) {
            print(tr.toString());
        }

    }
}
