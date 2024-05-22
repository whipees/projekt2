import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class where the game is played in
 */
public class Game extends JFrame {

    private JPanel panel;
    private JPanel shopPanel;
    private JLabel subscribersText;
    private JButton miningButton;
    private JButton shopButton;
    private JLabel hitext;
    private boolean addtwo = false;
    private boolean addten = false;
    private boolean addtwenty = false;
    private boolean auto2check = false;
    private boolean auto10check = false;

    private int subscribers;
    private boolean problemCheck = true;
    private boolean problemCheck2 = true;
    private long startTime = System.currentTimeMillis();

    /**
     * ActionListeres are for mining or switching to shops
     *
     * @param app1 to change the panel
     */
    public Game(App app1) {
        /**
         * IF user doesn't set his own username it will change to Influencer - it is set in .form file
         */
        if (!app1.getUsername().isEmpty()) {
            hitext.setText("Hello " + app1.getUsername());
        }

        //getContentPane().add(panel);
        Shop shop = new Shop(app1, this);
        shopPanel = shop.getPanel1();

        miningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateSubs();
                /**
                 * if user gets 500 or 501 seubs, he will have a problem and his subs will do away, cant happen twice
                 */
                if (subscribers == 500 && problemCheck || subscribers == 501 && problemCheck) {
                    JOptionPane.showMessageDialog(miningButton, "Oh no, you did something very very badly. The subscribers are going away");
                    setSubscribers(getSubscribers() - 350);
                    setProblemCheck(false);
                    subscribersText.setText("Subscribers: " + subscribers);
                }
                /**
                 * same thing but with 1000 or 1001
                 */
                if (subscribers == 1000 && problemCheck2 || subscribers == 1001 && problemCheck2) {
                    JOptionPane.showMessageDialog(miningButton, "Oh no, you did something very very badly. The subscribers are going away");
                    setSubscribers(getSubscribers() - 650);
                    setProblemCheck2(false);
                    subscribersText.setText("Subscribers: " + subscribers);
                }
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

    /**
     * method used to add 2 subs to sub count
     */
    public void SubAutoTwo() {
        setSubscribers(getSubscribers() + 2);
        subscribersText.setText("Subscribers: " + subscribers);
    }

    /**
     * if user buys this auto upgdrade it will automatically add 2 subs every two sec
     */
    public void startSubAutoTwoUpdate() {

        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubAutoTwo();
            }
        });
        timer.start();


    }


    /**
     * method used to add 10 subs to sub count
     */
    public void SubAutoTen() {


        setSubscribers(getSubscribers() + 10);
        subscribersText.setText("Subscribers: " + subscribers);


    }

    /**
     * if user buys this auto upgdrade it will automatically add 10 subs every two sec
     */
    public void startSubAutoTenUpdate() {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubAutoTen();
            }
        });
        timer.start();
    }

    /**
     * method used to add 100 subs to sub count
     */
    public void SubAutoHun() {


        setSubscribers(getSubscribers() + 100);
        subscribersText.setText("Subscribers: " + subscribers);


    }

    /**
     * if user buys this auto upgdrade it will automatically add 100 subs every two sec
     */
    public void startSubAutoHunUpdate() {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubAutoHun();
            }
        });
        timer.start();
    }

    public void updateSubs() {
        if (!addtwo && !addten && !addtwenty) {
            subscribers++;

        } else if (addtwo && !addten && !addtwenty) {
            setSubscribers(getSubscribers() + 2);

        } else if (!addtwo && addten && !addtwenty) {
            setSubscribers(getSubscribers() + 10);
        } else if (!addtwo && !addten && addtwenty) {
            setSubscribers(getSubscribers() + 20);
        }
        subscribersText.setText("Subscribers: " + subscribers);

    }

    /**
     * displays sub count
     *
     * @return subcounter
     */
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

    public void setProblemCheck(boolean problemCheck) {
        this.problemCheck = problemCheck;
    }

    public void setProblemCheck2(boolean problemCheck2) {
        this.problemCheck2 = problemCheck2;
    }

    public boolean isAddten() {
        return addten;
    }

    public void setAddten(boolean addten) {
        this.addten = addten;
    }

    public boolean isAddtwenty() {
        return addtwenty;
    }

    public void setAddtwenty(boolean addtwenty) {
        this.addtwenty = addtwenty;
    }

    public boolean isProblemCheck() {
        return problemCheck;
    }

    public boolean isProblemCheck2() {
        return problemCheck2;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public boolean isAuto2check() {
        return auto2check;
    }

    public void setAuto2check(boolean auto2check) {
        this.auto2check = auto2check;
    }

    public boolean isAuto10check() {
        return auto10check;
    }

    public void setAuto10check(boolean auto10check) {
        this.auto10check = auto10check;
    }


}
