public class EqualizerDecorator extends MusicPlayerDecorator {
    private String equalizerSetting;

    public EqualizerDecorator(MusicPlayerComponent decoratedPlayer, String equalizerSetting) {
        super(decoratedPlayer);
        this.equalizerSetting = equalizerSetting;
    }

    @Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Applying equalizer setting: " + equalizerSetting);
        // Code to apply equalizer setting
    }
}
