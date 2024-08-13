public class Main {
    public static void main(String[] args) {
        // Create a music source
        MusicSource localFile = new LocalFileAdapter("path/to/file.mp3");

        // Create a basic music player
        MusicPlayerComponent basicPlayer = new BasicMusicPlayer(localFile);

        // Add volume control and equalizer features
        MusicPlayerComponent decoratedPlayer = new VolumeControlDecorator(
            new EqualizerDecorator(basicPlayer, "Rock"), 10);

        // Play music with additional features
        decoratedPlayer.playMusic();
    }
}
