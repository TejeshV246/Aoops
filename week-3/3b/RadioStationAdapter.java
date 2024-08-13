public class RadioStationAdapter implements MusicSource {
    private String stationName;

    public RadioStationAdapter(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Tuning into radio station: " + stationName);
        // Code to play radio station
    }
}
