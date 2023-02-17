package com.in28minutes.learnspringframework.game;

public class GameRunner {
    SuperContraGame game;

    // GameRunner is strongly coupled to the game it receives in its constructor
    // If it wants to run Mario, it needs the concrete MarioGame class to be able to run it, or SuperContra if that is what we want
    // For changing between games for the runner we can either always keep modifying the GameRunner to change the game it receives
    // Alternatively we can create tightly coupled separate runners for each game type we wish to run
    // Both of these solutions are bad practices

    public GameRunner(SuperContraGame game) {
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
