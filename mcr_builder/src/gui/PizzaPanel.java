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
        JButton addOnionButton = new JButton("Onion");
        JButton addMozzarellaButton = new JButton("Mozzarella");

        JPanel pizzaButtons = new JPanel();
        pizzaButtons.setLayout(new GridLayout(10, 1, 0, 10));

        addDoughButton.addActionListener(ae -> pizzaBuildPanel.buildBase());
        addTomatoButton.addActionListener(ae -> pizzaBuildPanel.addTomato());
        addMozzarellaButton.addActionListener(ae -> pizzaBuildPanel.addMozzarella());
        addOnionButton.addActionListener(ae -> pizzaBuildPanel.addOnion());

        pizzaButtons.add(addDoughButton);
        pizzaButtons.add(addTomatoButton);
        pizzaButtons.add(addMozzarellaButton);
        pizzaButtons.add(addOnionButton);

        JButton bakeButton = new JButton("Bake");
        JButton getProductButton = new JButton("Get product");
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        bottom.add(bakeButton);
        bottom.add(getProductButton);
        bakeButton.addActionListener(ae -> pizzaBuildPanel.bake());
        getProductButton.addActionListener(ae -> pizzaBuildPanel.getProduct());

        add(pizzaBuildPanel, BorderLayout.CENTER);
        add(pizzaButtons, BorderLayout.WEST);
        add(bottom, BorderLayout.SOUTH);
    }
}
