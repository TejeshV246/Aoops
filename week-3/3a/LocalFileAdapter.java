public class LocalFileAdapter implements MusicSource {
    private String filePath;

    public LocalFileAdapter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + filePath);
    }

    @Override
    public void stop() {
        System.out.println("Stopping local file: " + filePath);
    }

    @Override
    public String getTrackInfo() {
        return "Local file: " + filePath;
    }
}
