import java.util.List;
import java.util.stream.Collectors;

public class CityFactory {

    public List<City> produceCities(List<String> cities) {
        return cities.stream()
                     .map(cityName -> new City(cityName))
                     .collect(Collectors.toList());
    }
}
