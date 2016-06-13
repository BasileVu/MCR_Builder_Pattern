package gui;

import gui.panels.BurgerPanel;
import gui.panels.PizzaPanel;

import javax.swing.*;
import java.awt.*;

/**
 * The main view of the application. Shows the two views of the burger and pizza builders.
 */
public class View extends JFrame {
    public View() {

        setLayout(new BorderLayout());

        PizzaPanel pizzaPanel = new PizzaPanel();
        BurgerPanel burgerPanel = new BurgerPanel();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Pizza", pizzaPanel);

        // FIXME tab for burger
        tabbedPane.addTab("Burger", burgerPanel);

        add(tabbedPane, BorderLayout.NORTH);

        pack();

        setTitle("Builder");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
