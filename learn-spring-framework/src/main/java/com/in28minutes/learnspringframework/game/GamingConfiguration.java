package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    @Primary
    public GamingConsole mario() {
        return new MarioGame();
    }

    @Bean
    public GamingConsole pacman() {
        return new PacManGame();
    }

    @Bean
    public GamingConsole contra() {
        return new SuperContraGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
