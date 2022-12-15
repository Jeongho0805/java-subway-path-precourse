package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class Path {

    private final List<String> twoStations;

    private final int distance;

    private final int time;

    public Path(String station1, String station2, int distance, int time) {
        List<String> twoStations = new ArrayList<>();
        twoStations.add(station1);
        twoStations.add(station2);
        this.twoStations = twoStations;
        this.distance = distance;
        this.time = time;
    }
}
