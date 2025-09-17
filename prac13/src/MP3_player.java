interface MediaPlayer{
    void play();
}

class WAV_adapter implements MediaPlayer {
    private WAV music_wav;

    public WAV_adapter(WAV music_wav) {
        this.music_wav = music_wav;
    }

    public void play() {
        music_wav.audio_wav();
    }
}

public class MP3_player implements MediaPlayer{
    private MP3 music_mp3 = new MP3();
    public void Adapter(WAV wav){
        WAV_adapter mysic_wav = new WAV_adapter(wav);
        mysic_wav.play();
    }
    public void play(){
        music_mp3.audio_mp3();
    }
}
