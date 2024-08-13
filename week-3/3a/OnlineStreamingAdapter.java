public class OnlineStreamingAdapter implements MusicSource {
    private String streamingUrl;

    public OnlineStreamingAdapter(String streamingUrl) {
        this.streamingUrl = streamingUrl;
    }

    @Override
    public void play() {
        System.out.println("Playing online stream: " + streamingUrl);
    }

    @Override
    public void stop() {
        System.out.println("Stopping online stream: " + streamingUrl);
    }

    @Override
    public String getTrackInfo() {
        return "Online stream: " + streamingUrl;
    }
}
