import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * All the  game construction is generated here
 */
public class App extends JFrame {


    private JPanel gamePanel;
    private JPanel panelMain;
    protected JTextField textField1;
    private JButton submitButton;
    protected String username;

    private JPanel welcomeScreen;

    /**
     * Constructor for App class.
     * Builds Jframe (title,size, etc.)
     * Contains 1 actionListener
     */
    public App() {

        setTitle("Influencer Tycoon");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        getContentPane().add(panelMain); // Add the initial panel to the content pane


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClick();
            }
        });
        setVisible(true);
    }

    /**
     * If user enters his name dialog will pop up
     * if not his name will be set to Influencer
     */
    public void btnClick() {
        String name = textField1.getText();
        username = name;


        JOptionPane.showMessageDialog(submitButton, "Hello, " + name + "!");
        startGame();
    }

    /**
     * Creates MainMenu class and adds it into Content pane
     */
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


}
