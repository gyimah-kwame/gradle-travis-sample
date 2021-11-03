package io.turntabl;

public abstract class Client implements Name {

    private String name;
    private String id;
    private ServiceLevel serviceLevel;

    public Client(String name, String id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }
}
