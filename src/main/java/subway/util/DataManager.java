package subway.util;

import subway.domain.*;

public class DataManager {

    public static void initData() {
        StationRepository.addStation(new Station("교대역"));
        StationRepository.addStation(new Station("강남역"));
        StationRepository.addStation(new Station("역삼역"));
        StationRepository.addStation(new Station("남부터미널역"));
        StationRepository.addStation(new Station("양재역"));
        StationRepository.addStation(new Station("매봉역"));
        StationRepository.addStation(new Station("양재시민의숲역"));

        LineRepository.addLine(new Line("2호선"));
        LineRepository.addLine(new Line("3호선"));
        LineRepository.addLine(new Line("신분당선"));

        PathRepository.add(new Path("교대역","강남역",2,3));
        PathRepository.add(new Path("강남역","역삼역",2,3));
        PathRepository.add(new Path("교대역","남부터미널역",3,2));
        PathRepository.add(new Path("남부터미널역","양재역",6,5));
        PathRepository.add(new Path("양재역","매봉역",1,1));
        PathRepository.add(new Path("강남역","양재역",2,8));
        PathRepository.add(new Path("양재역","양재시민의숲역",10,3));
    }
}
