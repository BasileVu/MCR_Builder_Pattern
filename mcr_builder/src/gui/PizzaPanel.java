package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 06.06.2016.
 */
public class PizzaPanel extends JPanel {

    final PizzaBuildPanel pizzaBuildPanel = new PizzaBuildPanel();

    public PizzaPanel() {

        setLayout(new BorderLayout());

        JButton addDoughButton = new JButton("Dough");
        JButton addTomatoButton = new JButton("Tomato");
        JButton addOnion = new JButton("Onion");
        JButton addMozzarellaButton = new JButton("Mozzarella");

        JPanel pizzaButtons = new JPanel();
        pizzaButtons.setLayout(new GridLayout(10, 1, 0, 10));

        addDoughButton.addActionListener(ae -> pizzaBuildPanel.buildBase());
        addTomatoButton.addActionListener(ae -> pizzaBuildPanel.addTomato());
        addMozzarellaButton.addActionListener(ae -> pizzaBuildPanel.addMozzarella());
        addOnion.addActionListener(ae -> pizzaBuildPanel.addOnion());

        pizzaButtons.add(addDoughButton);
        pizzaButtons.add(addTomatoButton);
        pizzaButtons.add(addMozzarellaButton);
        pizzaButtons.add(addOnion);

        JButton bakeButton = new JButton("Bake");
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        bottom.add(bakeButton);
        bakeButton.addActionListener(ae -> pizzaBuildPanel.bake());

        add(pizzaBuildPanel, BorderLayout.CENTER);
        add(pizzaButtons, BorderLayout.WEST);
        add(bottom, BorderLayout.SOUTH);
    }
}
