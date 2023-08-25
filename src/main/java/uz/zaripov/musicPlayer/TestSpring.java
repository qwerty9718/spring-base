package uz.zaripov.musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // 1 вариант  Внедрение зависимостей через консруктор вручную
        // В Context создается дочерний класс RockBean
        // В конструктов MusicPlayer втраиваем зависимость RockBean из Context
//        Music music = context.getBean("rockBean",Music.class);
//        MusicPlayer player = new MusicPlayer(music);
//        player.playMusic();



        // 2 Вариант  Внедрение зависимостей через консруктор в Контексте
        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
        player.playMusic();

        context.close();

    }
}
