import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Shop class
 * user upgrades his game expirience here
 */
public class Shop extends JFrame {
    private int money;
    private JPanel panel1;
    private JLabel label;
    private JButton backButton;
    private JButton button1;
    private JButton mineButton3;
    private JButton mineButton1;
    private JLabel moneytext;
    private JButton mineButton4;
    private JButton mineButton5;
    private JButton mineButton6;
    private JButton mineButton2;
    private JLabel itemName1;
    private JLabel itemPrice1;
    private JLabel itemPrice2;
    private JLabel itemPrice3;
    private JLabel itemPrice4;
    private JLabel itemPrice5;
    private JLabel itemPrice6;
    private JLabel itemName2;
    private JLabel itemName3;
    private JLabel itemName4;
    private JLabel itemName5;
    private JLabel itemName6;

    /**
     * Contains ActionListener for every deal in the shop
     *
     * @param app  to be able to change the contentpane
     * @param game to get back to game panel
     */
    public Shop(App app, Game game) {

        updateMoney(game);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButton(app, game);
            }
        });

        mineButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add2(game);
            }
        });

        mineButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add10(game);
            }
        });

        mineButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add20(game);
            }
        });

        mineButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auto2(game);
            }
        });

        mineButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auto10(game);
            }
        });


        mineButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auto100(game);
            }
        });
    }

    /**
     * deal in the shop to have +2 subs for every click
     * checks if you have the minimum amount of 50 subs
     */
    public void add2(Game game) {
        if (game.getSubscribers() >= 50) {
            game.setSubscribers(game.getSubscribers() - 50);
            plus2Button(game);
            setMoney(game.getSubscribers());
            game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
            mineButton1.setEnabled(false);
            mineButton3.setEnabled(false);
        }
    }

    /**
     * deal in the shop to have +10 subs for every click
     * checks if you have the minimum amount of 470 subs
     */
    public void add10(Game game) {
        if (game.getSubscribers() >= 470) {
            game.setSubscribers(game.getSubscribers() - 470);
            plus10button(game);
            setMoney(game.getSubscribers());
            game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
            mineButton1.setEnabled(false);
            mineButton2.setEnabled(false);
            mineButton3.setEnabled(true);
        }
    }

    /**
     * deal in the shop to have +20 subs for every click
     * checks if you have the minimum amount of 500 subs
     */
    public void add20(Game game) {
        if (game.getSubscribers() >= 500) {
            game.setSubscribers(game.getSubscribers() - 500);
            plus20button(game);
            setMoney(game.getSubscribers());
            game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
            mineButton1.setEnabled(false);
            mineButton2.setEnabled(false);
            mineButton3.setEnabled(false);
        }
    }

    /**
     * deal in the shop to have +2 subs every two secs automatically
     * checks if you have the minimum amount of 1000 subs
     */
    public void auto2(Game game) {
        if (game.getSubscribers() >= 1000) {
            game.setSubscribers(game.getSubscribers() - 1000);
            game.startSubAutoTwoUpdate();
            setMoney(game.getSubscribers());
            game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
            mineButton4.setEnabled(false);
            mineButton6.setEnabled(false);
        }
    }

    /**
     * deal in the shop to have +10 subs every two secs automatically
     * checks if you have the minimum amount of 1500 subs
     */
    public void auto10(Game game) {
        if (game.getSubscribers() >= 1500) {
            game.setSubscribers(game.getSubscribers() - 1500);
            game.startSubAutoTenUpdate();
            setMoney(game.getSubscribers());
            game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
            mineButton5.setEnabled(false);
            mineButton6.setEnabled(true);
            mineButton4.setEnabled(false);

        }
    }

    /**
     * deal in the shop to have +100 subs every two secs automatically
     * checks if you have the minimum amount of 4000 subs
     */
    public void auto100(Game game) {
        if (game.getSubscribers() >= 4000) {
            game.setSubscribers(game.getSubscribers() - 4000);
            game.startSubAutoHunUpdate();
            setMoney(game.getSubscribers());
            game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
            mineButton5.setEnabled(false);
            mineButton4.setEnabled(false);
            mineButton6.setEnabled(false);
        }
    }

    /**
     * updates money every two secs to be displayed corectlly in the shop
     *
     * @param game to get subs
     */
    public void updateMoney(Game game) {
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMoney(game.getSubscribers());
            }
        });
        timer.start();
    }

    /**
     * to get back to the game
     *
     * @param app  to be able to change the Content pane
     * @param game to get the Game panel
     */
    public void backButton(App app, Game game) {
        app.getContentPane().removeAll();
        app.getContentPane().add(game.getPanel());
        app.revalidate();
        app.repaint();
    }

    /**
     * if you buy it, it will be set to non active button
     *
     * @param game to start the method in the game class
     */
    public void plus2Button(Game game) {
        game.setAddtwo(true);
    }

    /**
     * if you buy it, it will be set to non active button
     *
     * @param game to start the method in the game class
     */
    public void plus10button(Game game) {
        game.setAddtwo(false);
        game.setAddten(true);
    }

    /**
     * if you buy it, it will be set to non active button
     *
     * @param game to start the method in the game class
     */
    public void plus20button(Game game) {
        game.setAddten(false);
        game.setAddtwo(false);
        game.setAddtwenty(true);
    }

    /**
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * sets correct money when you enter the shop
     *
     * @param money to know how much money user have
     */
    public void setMoney(int money) {
        this.money = money;
        this.moneytext.setText("Money: " + money);
    }

    public JPanel getPanel1() {
        return panel1;
    }


    public JLabel getLabel() {
        return label;
    }


    public JButton getBackButton() {
        return backButton;
    }


    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getMineButton3() {
        return mineButton3;
    }


    public JButton getMineButton1() {
        return mineButton1;
    }


    public JButton getMineButton4() {
        return mineButton4;
    }


    public JButton getMineButton5() {
        return mineButton5;
    }


    public JButton getMineButton6() {
        return mineButton6;
    }


    public JButton getMineButton2() {
        return mineButton2;
    }


    public JLabel getItemPrice1() {
        return itemPrice1;
    }


    public JLabel getItemPrice2() {
        return itemPrice2;
    }


    public JLabel getItemPrice3() {
        return itemPrice3;
    }


    public JLabel getItemPrice4() {
        return itemPrice4;
    }


    public JLabel getItemPrice5() {
        return itemPrice5;
    }


    public JLabel getItemPrice6() {
        return itemPrice6;
    }


}
