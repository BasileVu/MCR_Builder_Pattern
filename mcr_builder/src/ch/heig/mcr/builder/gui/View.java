package ch.heig.mcr.builder.gui;

import ch.heig.mcr.builder.gui.panels.PizzaPanel;
import ch.heig.mcr.builder.gui.panels.BurgerPanel;

import javax.swing.*;
import java.awt.*;

/**
 * The main view of the application. Shows the two views of the burger and pizza builders.
 *
 * @author Sébastien Boson, Benjamin Schubert, Mathieu Urstein, Basile Vu
 */
public class View extends JFrame {
    public View() {

        setLayout(new BorderLayout());

        PizzaPanel pizzaPanel = new PizzaPanel();
        BurgerPanel burgerPanel = new BurgerPanel();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Pizza", pizzaPanel);
        tabbedPane.addTab("Burger", burgerPanel);

        add(tabbedPane, BorderLayout.NORTH);

        pack();

        setTitle("Builder");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
