import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shop extends JFrame{
    private int money;
    private JPanel panel1;
    private JLabel label;
    private JButton backButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel moneytext;

    public Shop(Game game) {
        money = game.getCookies();
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                backButton(game);
            }
        });
    }
public void startShop(){

    setContentPane(panel1);
    setTitle("Influencer Tycoon");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}

//public void backButton(Game game){
//    getContentPane().remove(panel1); // Remove the initial panel
//    getContentPane().add(game.getPanel()); // Add the panel from Game class
//    revalidate();
//    repaint();
//}


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
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
}
