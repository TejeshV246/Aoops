public class AdvancedMusicPlayer extends MusicPlayer {

    public AdvancedMusicPlayer(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void playMusic() {
        musicSource.play();
        // Additional functionality if needed
    }
}
