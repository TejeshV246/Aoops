public class MusicStreamingApp {
    public static void main(String[] args) {
        MusicSource localFile = new LocalFileAdapter("song.mp3");
        MusicSource onlineStream = new OnlineStreamingAdapter("http://streaming.service/track");
        MusicSource radioStation = new RadioStationAdapter("http://radio.station/live");

        MusicSource equalizedLocalFile = new EqualizerDecorator(localFile);
        MusicSource volumeControlledStream = new VolumeControlDecorator(onlineStream, 75);
        MusicSource equalizedAndVolumeControlledRadio = new VolumeControlDecorator(new EqualizerDecorator(radioStation), 50);

        System.out.println("Playing equalized local file:");
        equalizedLocalFile.play();
        equalizedLocalFile.stop();

        System.out.println("\nPlaying volume-controlled online stream:");
        volumeControlledStream.play();
        volumeControlledStream.stop();

        System.out.println("\nPlaying equalized and volume-controlled radio station:");
        equalizedAndVolumeControlledRadio.play();
        equalizedAndVolumeControlledRadio.stop();
    }
}
