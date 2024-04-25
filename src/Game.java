import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Game extends JFrame{

    private JPanel panel;
    private JPanel shopPanel;
    private JLabel cookieText;
    private JButton button1;
    private JButton button2;
    private int cookies;


    public Game() {

        Shop shop = new Shop(this);
        shopPanel = shop.getPanel1();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCookies();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().remove(panel); // Remove the initial panel
                getContentPane().add(shopPanel); // Add the panel from Game class
                revalidate();
                repaint();
            }
        });
    }

    public void start(){


        panel.add(cookieText);
        panel.add(button1);
        setContentPane(panel);
        setTitle("Influencer Tycoon");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void updateCookies() {
        cookies++;
        cookieText.setText("Subscribers: " + cookies);
    }

    public void shopAppeal(){

    }


    public JLabel getCookieText() {
        return cookieText;
    }

    public void setCookieText(JLabel cookieText) {
        this.cookieText = cookieText;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public int getCookies() {
        return cookies;
    }

    public void setCookies(int cookies) {
        this.cookies = cookies;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
