public class Main {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        player.pressPlay();   // STOPPED → PLAYING
        player.pressPlay();
        player.pressPause();  // PLAYING → PAUSED
        player.pressPlay();   // PAUSED → PLAYING
        player.pressPause();  // PLAYING → PAUSED
    }
}