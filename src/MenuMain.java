import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main menu with Three buttons:
 * Play
 * Tutorial
 * Credits
 */
public class MenuMain {
    /**
     * class panel
     */
    private JPanel panel1;
    private JLabel label1;
    private JButton playButton;
    private JButton creditsButton;
    private JButton tutorialButton;

    /**
     * All the classes for buttons are created here, also the actionlisteners
     *
     * @param app  used to change the main content pane
     */
    public MenuMain(App app) {
        Game g = new Game(app);
        Tutorial t = new Tutorial(app, this);
        Credits c = new Credits(app,this);
        /**
         * loads into game onclick
         */
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.getContentPane().removeAll();
                app.getContentPane().add(g.getPanel());
                app.revalidate();
                app.repaint();
            }
        });
        /**
         * loads into tutorial
         */
        tutorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.getContentPane().removeAll();
                app.getContentPane().add(t.getTutorialPanel());
                app.revalidate();
                app.repaint();
            }
        });
        /**
         * loads into credits
         */
        creditsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.getContentPane().removeAll();
                app.getContentPane().add(c.getPanel());
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
