public class BasicMusicPlayer implements MusicPlayerComponent {
    private MusicSource musicSource;

    public BasicMusicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void playMusic() {
        musicSource.play();
    }
}
