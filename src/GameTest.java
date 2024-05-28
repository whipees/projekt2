import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

class GameTest {

    private Game game;
    private App app;


    @BeforeEach
    public void setUp() {
        app = new App();
        app.setUsername("user");
        game = new Game(app);
        game.setSubscribers(0);
        game.setSubscribersText(new JLabel());
    }

    @Test
    public void testDefaultIncrement() {

        game.setAddtwo(false);
        game.setAddten(false);
        game.setAddtwenty(false);

        game.updateSubs();

        Assertions.assertEquals(1, game.getSubscribers());
        Assertions.assertEquals("Subscribers: 1", game.getSubscribersText().getText());
    }

    @Test
    public void testIncrementBy2() {
        game.setAddtwo(true);
        game.setAddten(false);
        game.setAddtwenty(false);

        game.updateSubs();

        Assertions.assertEquals(2, game.getSubscribers());
        Assertions.assertEquals("Subscribers: 2", game.getSubscribersText().getText());
    }

    @Test
    public void testIncrementBy10() {
        game.setAddtwo(false);
        game.setAddten(true);
        game.setAddtwenty(false);

        game.updateSubs();
        Assertions.assertEquals(10, game.getSubscribers());
        Assertions.assertEquals("Subscribers: 10", game.getSubscribersText().getText());
    }

    @Test
    public void testIncrementBy20() {
        game.setAddtwo(false);
        game.setAddten(false);
        game.setAddtwenty(true);

        game.updateSubs();
        Assertions.assertEquals(20, game.getSubscribers());
        Assertions.assertEquals("Subscribers: 20", game.getSubscribersText().getText());
    }


}