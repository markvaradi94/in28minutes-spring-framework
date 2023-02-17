package com.in28minutes.learnspringframework.game;

public class GameRunner {
    GamingConsole game;

    // Using the GamingConsole interface makes the GameRunner loosely coupled to the games it has to run
    // So, GameRunner class is now decoupled from the specific implementation of GamingConsole

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
