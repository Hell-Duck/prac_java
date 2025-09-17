public class Main {
    public static void main(String[] args) {
        MP3_player player = new MP3_player();
        player.play();
        WAV file = new WAV();
        player.Adapter(file);
    }
}