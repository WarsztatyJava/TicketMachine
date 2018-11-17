package model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class City {

    private final String cityName;
    private final List<Connection> connections;

    @JsonCreator
    public City(
            @JsonProperty("city") String cityName,
            @JsonProperty("conections") List<Connection> connections) {
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
