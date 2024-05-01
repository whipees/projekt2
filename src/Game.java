import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame{

    private JPanel panel;
    private JPanel shopPanel;
    private JLabel cookieText;
    private JButton button1;
    private JButton shopButton;
    private JLabel hitext;
    private int cookies;


    public Game(App app1) {

        //getContentPane().add(panel);
        Shop shop = new Shop(app1,this);
        shopPanel = shop.getPanel1();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCookies();
            }
        });

        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app1.getContentPane().removeAll();
                app1.getContentPane().add(shopPanel);
                app1.revalidate();
                app1.repaint();

                shop.setMoney(cookies);
            }
        });



    }

    public void start(){




//
//        panel.add(cookieText);
//        panel.add(button1);
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

    public JPanel getShopPanel() {
        return shopPanel;
    }

    public void setShopPanel(JPanel shopPanel) {
        this.shopPanel = shopPanel;
    }

    public JButton getShopButton() {
        return shopButton;
    }

    public void setShopButton(JButton shopButton) {
        this.shopButton = shopButton;
    }

    public JLabel getHitext() {
        return hitext;
    }

    public void setHitext(JLabel hitext) {
        this.hitext = hitext;
    }
}
