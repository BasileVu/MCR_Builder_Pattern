package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 06.06.2016.
 */
public class View extends JFrame {
    public View() {

        setLayout(new BorderLayout());

        PizzaPanel pizzaPanel = new PizzaPanel();
        BurgerPanel burgerPanel = new BurgerPanel();

        JPanel pizzaTab = new JPanel();
        pizzaTab.setLayout(new BorderLayout());

        JPanel pizzaButtons = new JPanel();
        pizzaButtons.setLayout(new GridLayout(5,1));

        JButton addDoughButton = new JButton("Dough");
        JButton addTomatoButton = new JButton("Tomato");
        JButton addOnion = new JButton("Onion");
        JButton addMozzarellaButton = new JButton("Mozzarella");

        addDoughButton.addActionListener(ae -> pizzaPanel.buildBase());
        addTomatoButton.addActionListener(ae -> pizzaPanel.addTomato());
        addMozzarellaButton.addActionListener(ae -> pizzaPanel.addMozzarella());
        addOnion.addActionListener(ae -> pizzaPanel.addOnion());

        pizzaButtons.add(addDoughButton);
        pizzaButtons.add(addTomatoButton);
        pizzaButtons.add(addMozzarellaButton);
        pizzaButtons.add(addOnion);

        pizzaTab.add(pizzaPanel, BorderLayout.CENTER);
        pizzaTab.add(pizzaButtons, BorderLayout.WEST);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Pizza", pizzaTab);

        // FIXME tab for burger
        tabbedPane.addTab("Burger", burgerPanel);

        add(tabbedPane, BorderLayout.NORTH);

        JButton bakeButton = new JButton("Bake");
        bakeButton.addActionListener(ae -> pizzaPanel.bake());

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        bottom.add(bakeButton);

        add(bottom, BorderLayout.SOUTH);

        pack();

        setTitle("Builder");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
