package model;

import java.time.LocalTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Connection {
    private final String trainName;
//    @JsonFormat(pattern = "HH:mm")
    private final String leave;
//    @JsonFormat(pattern = "HH:mm")
    private final String arrive;
    private final String targetCity;
    private final List<Station> stations;

    @JsonCreator
    public Connection(
        @JsonProperty( "train") String trainName,
        @JsonProperty("leave") String leave,
        @JsonProperty("arrive") String arrive,
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

    public String getLeave() {
        return leave;
    }

    public String getArrive() {
        return arrive;
    }

    public String getTargetCity() {
        return targetCity;
    }

    public List<Station> getStations() {
        return stations;
    }
}
