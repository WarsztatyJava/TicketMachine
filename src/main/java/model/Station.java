package model;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Station {
    private final String stationName;
    private final int kilometers;
    private final LocalTime leave;
    private final LocalTime arrive;

    @JsonCreator
    public Station(
            @JsonProperty("name") String stationName,
            @JsonProperty("kilometers") int kilometers,
            @JsonProperty("leave") LocalTime leave,
            @JsonProperty("arrive") LocalTime arrive)
    {

        this.stationName = stationName;
        this.kilometers = kilometers;
        this.leave = leave;
        this.arrive = arrive;
    }

    public String getStationName() {
        return stationName;
    }

    public int getKilometers() {
        return kilometers;
    }

    public LocalTime getLeave() {
        return leave;
    }

    public LocalTime getArrive() {
        return arrive;
    }

}

