package model;

import java.util.List;

public class City {

    private final String cityName;
    private final List<Connection> connections;

    public City(String cityName, List<Connection> connections) {
        this.cityName = cityName;
        this.connections = connections;
    }

    public String getCityName() {
        return cityName;
    }

    public List<Connection> getConnections() {
        return connections;
    }
}
