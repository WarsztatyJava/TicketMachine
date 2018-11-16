import java.time.LocalTime;
import java.util.List;

public class Connection {
    private final String trainName;
    private final LocalTime leave;
    private final LocalTime arrive;
    private final String targetCity;
    private final List<Station> stations;

    public Connection(String trainName, LocalTime leave, LocalTime arrive, String targetCity, List<Station> stations) {
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
