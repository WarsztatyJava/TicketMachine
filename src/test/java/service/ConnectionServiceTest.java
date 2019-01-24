package service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Connection;
import model.Station;

class ConnectionServiceTest {

    @Test
    public void availableStationNameTest() {
        List<Connection> connections = new ArrayList<>();
        Connection connection = mock(Connection.class);
        connections.add(connection);
        List<Station> stations = new ArrayList<>();
        Station station = mock(Station.class);
        stations.add(station);
        when(connection.getStations()).thenReturn(stations);

        ConnectionService connectionService = new ConnectionService(connections);

        List<String> stationNames = connectionService.availableStationNames();
        assertThat(stationNames, hasSize(1));
    }

    @Test
    public void shouldReturnPossibleDestinationsBasedOnStartingStation() {
        Connection connection1 = mock(Connection.class);

        Station station1 = mock(Station.class);
        when(station1.getStationName()).thenReturn("1");
        Station station2 = mock(Station.class);
        when(station2.getStationName()).thenReturn("2");
        Station station3 = mock(Station.class);
        when(station3.getStationName()).thenReturn("3");

        when(connection1.getStations()).thenReturn(Arrays.asList(station1, station2, station3));


        Connection connection2 = mock(Connection.class);
        Station station4 = mock(Station.class);
        when(station4.getStationName()).thenReturn("4");
        Station station5 = mock(Station.class);
        when(station5.getStationName()).thenReturn("5");
        Station station6 = mock(Station.class);
        when(station6.getStationName()).thenReturn("1");
        Station station7 = mock(Station.class);
        when(station7.getStationName()).thenReturn("2");

        when(connection2.getStations()).thenReturn(Arrays.asList(station4, station5, station6, station7));

        ConnectionService connectionService = new ConnectionService(Arrays.asList(connection1, connection2));

        assertThat(connectionService.getPossibleDestination("2"), hasSize(4));

    }
}