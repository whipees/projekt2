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
     * All the classes for buttons are created here, also the action-listeners
     *
     * @param app used to change the main content pane
     */
    public MenuMain(App app) {
        Game g = new Game(app);
        Tutorial t = new Tutorial(app, this);
        Credits c = new Credits(app, this);

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame(app, g);
            }
        });

        tutorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTutorial(app, t);
            }
        });

        creditsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startCredits(app, c);
            }
        });
    }

    /**
     * loads into game onclick
     *
     * @param app to change scenery
     * @param g   to start game
     */
    public void startGame(App app, Game g) {
        app.getContentPane().removeAll();
        app.getContentPane().add(g.getPanel());
        app.revalidate();
        app.repaint();
    }

    /**
     * loads into tutorial
     *
     * @param app to change scenery
     * @param t   to start tutorial Class
     */
    public void startTutorial(App app, Tutorial t) {
        app.getContentPane().removeAll();
        app.getContentPane().add(t.getTutorialPanel());
        app.revalidate();
        app.repaint();
    }

    /**
     * loads into credits
     *
     * @param app to change scenery
     * @param c   to start Credits CLass
     */
    public void startCredits(App app, Credits c) {
        app.getContentPane().removeAll();
        app.getContentPane().add(c.getPanel());
        app.revalidate();
        app.repaint();
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


}
