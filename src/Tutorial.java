import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class where you can see the tutorial
 */
public class Tutorial {
    private JPanel tutorialPanel;
    private JLabel heading;
    private JButton backButton;
    private JLabel text1tut;
    private JLabel text2tut;
    private JLabel text3tut;

    /**
     * There is a action listener for button to get back to MainMenu
     *
     * @param app  used to change content pane
     * @param menu used to get back to menu screen
     */
    public Tutorial(App app, MenuMain menu) {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backButton(app, menu);
            }
        });
    }

    /**
     * Changes back to menu
     *
     * @param app  used to change screens
     * @param menu used to get menu panel
     */
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


    public JLabel getText1tut() {
        return text1tut;
    }


    public JLabel getText2tut() {
        return text2tut;
    }


    public JLabel getText3tut() {
        return text3tut;
    }


}
