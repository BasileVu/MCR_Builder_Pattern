package gui.panels;

import javax.swing.*;
import java.awt.*;

/**
 * Contains the view of the pizza being built and the buttons to modify it.
 */
public class PizzaPanel extends JPanel {

    final PizzaBuildPanel pizzaBuildPanel = new PizzaBuildPanel();

    public PizzaPanel() {

        setLayout(new BorderLayout());

        JButton addDoughButton = new JButton("Dough");
        JButton addBasilButton = new JButton("Basil");
        JButton addOlivesButton = new JButton("Olive");
        JButton addMushroomsButton = new JButton("Mushroom");
        JButton addTomatoButton = new JButton("Tomato");
        JButton addOnionButton = new JButton("Onion");
        JButton addMozzarellaButton = new JButton("Mozzarella");

        JPanel pizzaButtonsLeft = new JPanel();
        JPanel pizzaButtonsRight = new JPanel();
        pizzaButtonsLeft.setLayout(new GridLayout(10, 1, 0, 10));
        pizzaButtonsRight.setLayout(new GridLayout(10, 1, 0, 10));

        addDoughButton.addActionListener(ae -> pizzaBuildPanel.buildBase());
        addBasilButton.addActionListener(ae -> pizzaBuildPanel.addBasil());
        addOlivesButton.addActionListener(ae -> pizzaBuildPanel.addOlives());
        addMushroomsButton.addActionListener(ae -> pizzaBuildPanel.addMushrooms());
        addTomatoButton.addActionListener(ae -> pizzaBuildPanel.addTomato());
        addOnionButton.addActionListener(ae -> pizzaBuildPanel.addOnion());
        addMozzarellaButton.addActionListener(ae -> pizzaBuildPanel.addMozzarella());

        pizzaButtonsLeft.add(addDoughButton);
        pizzaButtonsLeft.add(addBasilButton);
        pizzaButtonsLeft.add(addOlivesButton);
        pizzaButtonsLeft.add(addMushroomsButton);
        pizzaButtonsRight.add(addTomatoButton);
        pizzaButtonsRight.add(addOnionButton);
        pizzaButtonsRight.add(addMozzarellaButton);

        JButton bakeButton = new JButton("Bake");
        JButton reinitializeButton = new JButton("Reinitialize");
        JButton getProductButton = new JButton("Get product");
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        bottom.add(bakeButton);
        bottom.add(reinitializeButton);
        bottom.add(getProductButton);
        bakeButton.addActionListener(ae -> pizzaBuildPanel.bake());
        reinitializeButton.addActionListener(ae -> pizzaBuildPanel.reinitialize());
        getProductButton.addActionListener(ae -> pizzaBuildPanel.getProduct());

        add(pizzaBuildPanel, BorderLayout.CENTER);
        add(pizzaButtonsLeft, BorderLayout.WEST);
        add(pizzaButtonsRight, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);
    }
}
