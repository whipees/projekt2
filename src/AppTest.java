import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest extends App {


    @Test
    public void btnClick() {
        App app = new App();
        String name = app.textField1.getText();
        app.username = name;
        Assertions.assertEquals(name, app.username);
    }



}