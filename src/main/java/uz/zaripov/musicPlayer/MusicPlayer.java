package uz.zaripov.musicPlayer;

public class MusicPlayer {

    private Music music;

    private String name;
    private int volume;

    // IoC через Конструктор
    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer() {}


    public void playMusic(){
        System.out.println(music.getSong());
    }

    public void doMyInit(){
        System.out.println("Идет инициализация");
    }

    public void doMyDestroy(){
        System.out.println("Идет деконструкция");
    }

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
