public class RadioStationAdapter implements MusicSource {
    private String stationUrl;

    public RadioStationAdapter(String stationUrl) {
        this.stationUrl = stationUrl;
    }

    @Override
    public void play() {
        System.out.println("Playing radio station: " + stationUrl);
    }

    @Override
    public void stop() {
        System.out.println("Stopping radio station: " + stationUrl);
    }

    @Override
    public String getTrackInfo() {
        return "Radio station: " + stationUrl;
    }
}
