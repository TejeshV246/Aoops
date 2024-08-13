public class VolumeControlDecorator extends MusicSourceDecorator {
    private int volumeLevel;

    public VolumeControlDecorator(MusicSource decoratedMusicSource, int volumeLevel) {
        super(decoratedMusicSource);
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void play() {
        super.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Volume set to " + volumeLevel);
    }
}
