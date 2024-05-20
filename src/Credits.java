import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Credits {
    private JLabel name;
    private JButton backButton;
    private JPanel panel;

    public Credits(App app, MenuMain menu) {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                back(app,menu);
            }
        });
    }

    public void back(App app, MenuMain menu) {
        app.getContentPane().removeAll();
        app.getContentPane().add(menu.getPanel1());
        app.revalidate();
        app.repaint();
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getName() {
        return name;
    }

    public void setName(JLabel name) {
        this.name = name;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }
}
