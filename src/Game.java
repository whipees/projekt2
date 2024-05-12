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
    private boolean addten = false;
    private boolean addtwenty = false;
    private boolean auto2check = false;
    private boolean auto10check = false;

    private int subscribers;
    private boolean problemCheck = true;
    private boolean problemCheck2 = true;
    private long startTime = System.currentTimeMillis();


    public Game(App app1) {
        setSubscribers(50000);
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

                if (subscribers == 500 && problemCheck || subscribers == 501 && problemCheck) {
                    JOptionPane.showMessageDialog(miningButton, "Oh no, you did something very very badly. The subscribers are going away");
                    setSubscribers(getSubscribers() - 350);
                    setProblemCheck(false);
                    subscribersText.setText("Subscribers: " + subscribers);
                }

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

    public void SubAutoTwo() {


        setSubscribers(getSubscribers() + 2);
        subscribersText.setText("Subscribers: " + subscribers);


    }
    public void startSubAutoTwoUpdate() {
        while (!auto2check){
            Timer timer = new Timer(2000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SubAutoTwo();
                }
            });
            timer.start();
        }

    }





    public void SubAutoTen() {


        setSubscribers(getSubscribers() + 10);
        subscribersText.setText("Subscribers: " + subscribers);


    }
    public void startSubAutoTenUpdate() {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubAutoTen();
            }
        });
        timer.start();
    }
    public void SubAutoHun() {


        setSubscribers(getSubscribers() + 100);
        subscribersText.setText("Subscribers: " + subscribers);


    }
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

    @Override
    public String toString() {
        return "Game{" +
                "panel=" + panel +
                ", shopPanel=" + shopPanel +
                ", subscribersText=" + subscribersText +
                ", miningButton=" + miningButton +
                ", shopButton=" + shopButton +
                ", hitext=" + hitext +
                ", addtwo=" + addtwo +
                ", addten=" + addten +
                ", addtwenty=" + addtwenty +
                ", subscribers=" + subscribers +
                ", problemCheck=" + problemCheck +
                ", problemCheck2=" + problemCheck2 +
                ", startTime=" + startTime +
                ", rootPane=" + rootPane +
                ", rootPaneCheckingEnabled=" + rootPaneCheckingEnabled +
                ", accessibleContext=" + accessibleContext +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
