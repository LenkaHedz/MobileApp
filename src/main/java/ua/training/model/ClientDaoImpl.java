package ua.training.model;

import java.util.ArrayList;
import java.util.List;

public class ClientDaoImpl implements ClientDao {
    private List<Client> listClient;

    public ClientDaoImpl() {
        this.listClient = ClientDB.fromClientDB();
    }

    public List<Client> getListClient() {
        return listClient;
    }

    public boolean addClientInList(Client client) {
        return this.listClient.add(client);
    }

    public boolean removeClientFromList(Client client){
        return this.listClient.remove(client);
    }

    @Override
    public List<Client> findAll() {
        return this.listClient;
    }

    @Override
    public List<Client> findByTariff(Tariff tariff) {
        List<Client> clients = new ArrayList<Client>();
        for (Client cl: this.listClient) {
            if(cl.getTariff().equals(tariff)){
                clients.add(cl);
            }
        }
        return clients;
    }
}
