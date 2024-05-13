import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuMain {
    private JPanel panel1;
    private JLabel label1;
    private JButton playButton;
    private JButton creditsButton;
    private JButton tutorialButton;

    public MenuMain(App app) {
        Game g = new Game(app);
        Tutorial t = new Tutorial(app, this);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.getContentPane().removeAll();
                app.getContentPane().add(g.getPanel());
                app.revalidate();
                app.repaint();
            }
        });
        tutorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.getContentPane().removeAll();
                app.getContentPane().add(t.getTutorialPanel());
                app.revalidate();
                app.repaint();
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JButton getPlayButton() {
        return playButton;
    }

    public void setPlayButton(JButton playButton) {
        this.playButton = playButton;
    }

    public JButton getCreditsButton() {
        return creditsButton;
    }

    public void setCreditsButton(JButton creditsButton) {
        this.creditsButton = creditsButton;
    }

    public JButton getTutorialButton() {
        return tutorialButton;
    }

    public void setTutorialButton(JButton tutorialButton) {
        this.tutorialButton = tutorialButton;
    }

    @Override
    public String toString() {
        return "MenuMain{" +
                "panel1=" + panel1 +
                ", label1=" + label1 +
                ", playButton=" + playButton +
                ", creditsButton=" + creditsButton +
                ", tutorialButton=" + tutorialButton +
                '}';
    }
}
