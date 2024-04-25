import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shop extends JFrame{
    private JPanel panel1;
    private JLabel label;
    private JButton backButton;

    public Shop(Game game) {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButton(game);
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

public void backButton(Game game){
    getContentPane().remove(panel1); // Remove the initial panel
    getContentPane().add(game.getPanel()); // Add the panel from Game class
    revalidate();
    repaint();
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
