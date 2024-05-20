import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial {
    private JPanel tutorialPanel;
    private JLabel heading;
    private JButton backButton;
    private JLabel text1tut;
    private JLabel text2tut;
    private JLabel text3tut;

    public Tutorial(App app, MenuMain menu) {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButton(app,menu);
            }
        });
    }

    public void backButton(App app, MenuMain menu) {
        app.getContentPane().removeAll();
        app.getContentPane().add(menu.getPanel1());
        app.revalidate();
        app.repaint();

    }

    public JPanel getTutorialPanel() {
        return tutorialPanel;
    }

    public void setTutorialPanel(JPanel tutorialPanel) {
        this.tutorialPanel = tutorialPanel;
    }

    public JLabel getHeading() {
        return heading;
    }

    public void setHeading(JLabel heading) {
        this.heading = heading;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JLabel getText1tut() {
        return text1tut;
    }

    public void setText1tut(JLabel text1tut) {
        this.text1tut = text1tut;
    }

    public JLabel getText2tut() {
        return text2tut;
    }

    public void setText2tut(JLabel text2tut) {
        this.text2tut = text2tut;
    }

    public JLabel getText3tut() {
        return text3tut;
    }

    public void setText3tut(JLabel text3tut) {
        this.text3tut = text3tut;
    }
}
