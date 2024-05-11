import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class App extends JFrame {


    private JPanel gamePanel;
    private JPanel panelMain;
    private JTextField textField1;
    private JButton submitButton;
    private String username;

    private JPanel welcomeScreen;


    public App() {



        setTitle("Influencer Tycoon");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        getContentPane().add(panelMain); // Add the initial panel to the content pane
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                username = name;


                JOptionPane.showMessageDialog(submitButton, "Hello, " + name + "!");
                startGame();
            }
        });
        setVisible(true);
    }

    public void startGame() {
        MenuMain menuMain = new MenuMain(this);
        gamePanel = menuMain.getPanel1();
        System.out.println(username);
        getContentPane().remove(panelMain); // Remove the initial panel
        getContentPane().add(gamePanel); // Add the panel from Game class
        revalidate();
        repaint();
    }

    public JPanel getGamePanel() {
        return gamePanel;
    }

    public void setGamePanel(JPanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public JPanel getPanelMain() {
        return panelMain;
    }

    public void setPanelMain(JPanel panelMain) {
        this.panelMain = panelMain;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JPanel getWelcomeScreen() {
        return welcomeScreen;
    }

    public void setWelcomeScreen(JPanel welcomeScreen) {
        this.welcomeScreen = welcomeScreen;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "App{" +

                ", gamePanel=" + gamePanel +
                ", panelMain=" + panelMain +
                ", textField1=" + textField1 +
                ", submitButton=" + submitButton +
                ", username='" + username + '\'' +
                ", welcomeScreen=" + welcomeScreen +
                ", rootPane=" + rootPane +
                ", rootPaneCheckingEnabled=" + rootPaneCheckingEnabled +
                ", accessibleContext=" + accessibleContext +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
