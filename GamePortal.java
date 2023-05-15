package Game;
import java.io.File;

public interface GamePortal {
    String getGameName();

    void play(); // must be able to play a game

    String getScore(); // get a score - if there is no "score" then we

    void writeHighScore(File f); // writes the high score of this game to a file.

}