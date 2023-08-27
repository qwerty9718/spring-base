package uz.zaripov.musicPlayer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("uz.zaripov.musicPlayer")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {



}
