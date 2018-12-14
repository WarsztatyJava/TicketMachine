package model;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Station {
    private final String stationName;
    private final int kilometers;
//    @JsonFormat(pattern = "HH:mm")
    private final String leave;
//    @JsonFormat(pattern = "HH:mm")
    private final String arrive;

    @JsonCreator
    public Station(
            @JsonProperty("name") String stationName,
            @JsonProperty("kilometers") int kilometers,
            @JsonProperty("leave") String leave,
            @JsonProperty("arrive") String arrive)
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

    public String getLeave() {
        return leave;
    }

    public String getArrive() {
        return arrive;
    }

}

