package uz.zaripov.musicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music;
    private Music music2;

    private String name;
    private int volume;

    public String playMusic(){
        String res = "Плеер запустил " + music.getSong() + "\n" + music2.getSong();
        return res;
    }


    // IoC через Конструктор
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music, @Qualifier("classicalMusic")Music music2){
        this.music = music;
        this.music2 = music2;
    }
    public MusicPlayer() {}




    // IoC через Setter
    public void setMusic(Music music) {
        this.music = music;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
