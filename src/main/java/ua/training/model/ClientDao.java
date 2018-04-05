package ua.training.model;

import java.util.List;

public interface ClientDao {
    List<Client> findAll();
    List<Client> findByTariff(Tariff tariff);
}
