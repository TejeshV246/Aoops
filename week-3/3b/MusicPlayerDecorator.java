public abstract class MusicPlayerDecorator implements MusicPlayerComponent {
    protected MusicPlayerComponent decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayerComponent decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void playMusic() {
        decoratedPlayer.playMusic();
    }
}
