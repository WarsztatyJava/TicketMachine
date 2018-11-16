package model;

import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Connection {
    private final String trainName;
    private final LocalTime leave;
    private final LocalTime arrive;
    private final String targetCity;
    private final List<Station> stations;
@JsonCreator
    public Connection(
        @JsonProperty( "train") String trainName,
        @JsonProperty("leave") LocalTime leave,
        @JsonProperty("arrive") LocalTime arrive,
        @JsonProperty("targetCity") String targetCity,
        @JsonProperty("stations") List<Station> stations) {
        this.trainName = trainName;
        this.leave = leave;
        this.arrive = arrive;
        this.targetCity = targetCity;
        this.stations = stations;
    }

    public String getTrainName() {
        return trainName;
    }

    public LocalTime getLeave() {
        return leave;
    }

    public LocalTime getArrive() {
        return arrive;
    }

    public String getTargetCity() {
        return targetCity;
    }

    public List<Station> getStations() {
        return stations;
    }
}
