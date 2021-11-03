package io.turntabl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {

    private List<Client> clients;

    public Register(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> getNamesOfGoldClients() {
        return clients.stream()
                .filter(s -> s.getServiceLevel() == ServiceLevel.GOLD)
                .map(Client::getClientName)
                .collect(Collectors.toList());
    }

    public Optional<String> getClientNameById(String id) {
        return clients.stream()
                .filter(s -> s.getId().equals(id))
                .map(Client::getClientName)
                .findFirst();
    }

    public Map<ServiceLevel, Long> getNumberOfClientsInEachLevel() {
        return clients.stream()
                .collect(Collectors.groupingBy(Client::getServiceLevel, Collectors.counting()));
    }


}
