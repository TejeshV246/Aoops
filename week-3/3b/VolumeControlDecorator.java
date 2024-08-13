public class VolumeControlDecorator extends MusicPlayerDecorator {
    private int volumeLevel;

    public VolumeControlDecorator(MusicPlayerComponent decoratedPlayer, int volumeLevel) {
        super(decoratedPlayer);
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Setting volume to: " + volumeLevel);
        // Code to adjust volume
    }
}
