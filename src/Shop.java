import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                if (game.getSubscribers() >= 50) {
                    game.setSubscribers(game.getSubscribers() - 50);
                    plus2Button(game);
                    setMoney(game.getSubscribers());
                    game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
                    mineButton1.setEnabled(false);
                }

            }
        });
        mineButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (game.getSubscribers() >= 1500) {
                    game.setSubscribers(game.getSubscribers() - 1500);
                    game.startSubAutoUpdate();
                    setMoney(game.getSubscribers());
                    game.getSubscribersText().setText("Subscribers: " + game.getSubscribers());
                    mineButton5.setEnabled(false);
                }
            }
        });
    }

    public void updateMoney(Game game){
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMoney(game.getSubscribers());
            }
        });
        timer.start();
    }


    public void backButton(App app, Game game) {
        app.getContentPane().removeAll();
        app.getContentPane().add(game.getPanel());
        app.revalidate();
        app.repaint();
    }

    public void plus2Button(Game game) {
        game.setAddtwo(true);
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
        this.moneytext.setText("Money: " + money);
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return mineButton3;
    }

    public void setButton2(JButton button2) {
        this.mineButton3 = button2;
    }

    public JButton getButton3() {
        return mineButton1;
    }

    public void setButton3(JButton button3) {
        this.mineButton1 = button3;
    }

    public JLabel getMoneytext() {
        return moneytext;
    }

    public void setMoneytext(JLabel moneytext) {
        this.moneytext = moneytext;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JButton getMineButton3() {
        return mineButton3;
    }

    public void setMineButton3(JButton mineButton3) {
        this.mineButton3 = mineButton3;
    }

    public JButton getMineButton1() {
        return mineButton1;
    }

    public void setMineButton1(JButton mineButton1) {
        this.mineButton1 = mineButton1;
    }

    public JButton getMineButton4() {
        return mineButton4;
    }

    public void setMineButton4(JButton mineButton4) {
        this.mineButton4 = mineButton4;
    }

    public JButton getMineButton5() {
        return mineButton5;
    }

    public void setMineButton5(JButton mineButton5) {
        this.mineButton5 = mineButton5;
    }

    public JButton getMineButton6() {
        return mineButton6;
    }

    public void setMineButton6(JButton mineButton6) {
        this.mineButton6 = mineButton6;
    }

    public JButton getMineButton2() {
        return mineButton2;
    }

    public void setMineButton2(JButton mineButton2) {
        this.mineButton2 = mineButton2;
    }

    public JLabel getItemName1() {
        return itemName1;
    }

    public void setItemName1(JLabel itemName1) {
        this.itemName1 = itemName1;
    }

    public JLabel getItemPrice1() {
        return itemPrice1;
    }

    public void setItemPrice1(JLabel itemPrice1) {
        this.itemPrice1 = itemPrice1;
    }

    public JLabel getItemPrice2() {
        return itemPrice2;
    }

    public void setItemPrice2(JLabel itemPrice2) {
        this.itemPrice2 = itemPrice2;
    }

    public JLabel getItemPrice3() {
        return itemPrice3;
    }

    public void setItemPrice3(JLabel itemPrice3) {
        this.itemPrice3 = itemPrice3;
    }

    public JLabel getItemPrice4() {
        return itemPrice4;
    }

    public void setItemPrice4(JLabel itemPrice4) {
        this.itemPrice4 = itemPrice4;
    }

    public JLabel getItemPrice5() {
        return itemPrice5;
    }

    public void setItemPrice5(JLabel itemPrice5) {
        this.itemPrice5 = itemPrice5;
    }

    public JLabel getItemPrice6() {
        return itemPrice6;
    }

    public void setItemPrice6(JLabel itemPrice6) {
        this.itemPrice6 = itemPrice6;
    }

    public JLabel getItemName2() {
        return itemName2;
    }

    public void setItemName2(JLabel itemName2) {
        this.itemName2 = itemName2;
    }

    public JLabel getItemName3() {
        return itemName3;
    }

    public void setItemName3(JLabel itemName3) {
        this.itemName3 = itemName3;
    }

    public JLabel getItemName4() {
        return itemName4;
    }

    public void setItemName4(JLabel itemName4) {
        this.itemName4 = itemName4;
    }

    public JLabel getItemName5() {
        return itemName5;
    }

    public void setItemName5(JLabel itemName5) {
        this.itemName5 = itemName5;
    }

    public JLabel getItemName6() {
        return itemName6;
    }

    public void setItemName6(JLabel itemName6) {
        this.itemName6 = itemName6;
    }
}
