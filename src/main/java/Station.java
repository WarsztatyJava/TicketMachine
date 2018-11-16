import java.time.LocalTime;

public class Station {
    private final String stationName;
    private final String stationCode;
    private final int kilometers;
    private final LocalTime leave;
    private final LocalTime arrive;


    public Station(String stationName, String stationCode, int kilometers, LocalTime leave, LocalTime arrive) {
        this.stationName = stationName;
        this.stationCode = stationCode;
        this.kilometers = kilometers;
        this.leave = leave;
        this.arrive = arrive;
    }

    public String getStationName() {
        return stationName;
    }

    public String getStationCode() {
        return stationCode;
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

