import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {


    private JPanel ds;
    private JPanel panelMain;
    private JLabel Jname;
    private JTextField textField1;
    private JButton button1;

    public App() {
        Game g = new Game();

        ds = g.getPanel();
        setTitle("Influencer Tycoon");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(panelMain); // Add the initial panel to the content pane
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                JOptionPane.showMessageDialog(button1, "Hello, " + name + "!");
                startGame();
            }
        });
        setVisible(true);
    }

    public void startGame() {
        getContentPane().remove(panelMain); // Remove the initial panel
        getContentPane().add(ds); // Add the panel from Game class
        revalidate();
        repaint();
    }




}
