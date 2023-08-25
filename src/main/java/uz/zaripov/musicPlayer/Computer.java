package uz.zaripov.musicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player) {
        this.player = player;
    }



    public void startMusicPlayer(){
        System.out.println("Computer with id " + id + " started "+ player.playMusic());
    }


    public void setId(int id) {
        this.id = id;
    }
}
