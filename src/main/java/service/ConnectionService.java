package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Connection;
import model.Station;

public class ConnectionService {
    private List<Connection> connections;

    public ConnectionService(List<Connection> connections) {
        this.connections = connections;
    }

    public List<String> availableStationNames() {
        ArrayList<String> stationNames = new ArrayList<>();
        for (Connection connection : connections) {
            for (Station station : connection.getStations()) {
                stationNames.add(station.getStationName());
            }

        }
        return stationNames;
    }

    public List<String> getPossibleDestination(String startingStation) {
        ArrayList<String> possibleDestinations = new ArrayList<>();
        for (Connection connection : connections) {
            for (Station station : connection.getStations()) {
                if (startingStation.equals(station.getStationName())) {
                    for (Station possibleStation : connection.getStations()) {
                        if (!startingStation.equals(possibleStation.getStationName())) {
                            possibleDestinations.add(possibleStation.getStationName());
                        }
                    }

                }

            }

        }
        ArrayList<String> possibleDestWithoutDubbles = new ArrayList<>(possibleDestinations.size());

        boolean duplicatedFound = false;
        for (String possibleDuplicated : possibleDestinations) {
            for (String uniqueDestination : possibleDestWithoutDubbles) {
                if (possibleDuplicated.equals(uniqueDestination)){
                    duplicatedFound = true;
                    break;
                }
            }
            if (!duplicatedFound){
                possibleDestWithoutDubbles.add(possibleDuplicated);
            }
            duplicatedFound = false;
        }

        return possibleDestWithoutDubbles;
    }
}