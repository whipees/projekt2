import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    private JPanel panel;
    private JPanel shopPanel;
    private JLabel subscribersText;
    private JButton miningButton;
    private JButton shopButton;
    private JLabel hitext;
    private boolean addtwo = false;
    private int subscribers;


    public Game(App app1) {

        if (!app1.getUsername().isEmpty()){
            hitext.setText("Hello "+ app1.getUsername());
        }

        //getContentPane().add(panel);
        Shop shop = new Shop(app1, this);
        shopPanel = shop.getPanel1();

        miningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSubs();
            }
        });

        shopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app1.getContentPane().removeAll();
                app1.getContentPane().add(shopPanel);
                app1.revalidate();
                app1.repaint();

                shop.setMoney(subscribers);
            }
        });


    }


    public void updateSubs() {
        if (!addtwo) {
            subscribers++;

        } else if (addtwo) {
            setSubscribers(getSubscribers() + 2);

        }
        subscribersText.setText("Subscribers: " + subscribers);

    }



    public JLabel getSubscribersText() {
        return subscribersText;
    }

    public void setSubscribersText(JLabel subscribersText) {
        this.subscribersText = subscribersText;
    }

    public JButton getMiningButton() {
        return miningButton;
    }

    public void setMiningButton(JButton miningButton) {
        this.miningButton = miningButton;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
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

    public boolean isAddtwo() {
        return addtwo;
    }

    public void setAddtwo(boolean addtwo) {
        this.addtwo = addtwo;
    }
}
