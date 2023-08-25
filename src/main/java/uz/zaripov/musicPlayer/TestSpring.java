package uz.zaripov.musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        Computer computer = context.getBean("computer", Computer.class);
        computer.startMusicPlayer();

        context.close();

    }
}
