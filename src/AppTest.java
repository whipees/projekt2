import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest{


    @Test
    public void btnClick() {
        App app = new App();
        String name = app.textField1.getText();
        app.username = name;
        Assertions.assertEquals(name, app.username);
    }

    @Test
    public void testUsernameOutput() {
        App app = new App();
        app.setUsername("testUser");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        app.startGame();

        Assertions.assertTrue(outContent.toString().contains("testUser"));
    }



}