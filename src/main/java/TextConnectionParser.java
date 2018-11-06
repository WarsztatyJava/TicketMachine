import static java.util.Arrays.asList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TextConnectionParser {
    private final CityFactory cityFactory;

    public TextConnectionParser(CityFactory cityFactory) {
        this.cityFactory = cityFactory;
    }

    public List<City> parseText(File file) throws IOException {

        List<String> splitedCities = splitFile(file);

        return cityFactory.produceCities(splitedCities);
    }

    private List<String> splitFile(File file) throws IOException {
        List<String> splitedCities = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitedLine = line.split(",");
                Stream.of(splitedLine)
                      .forEach(city -> city.trim());
                splitedCities.addAll(asList(splitedLine));
            }

        }
        return splitedCities;
    }

}
