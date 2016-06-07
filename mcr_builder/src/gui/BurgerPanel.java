package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 06.06.2016.
 */
public class BurgerPanel extends JPanel {
    final BurgerBuildPanel burgerBuildPanel = new BurgerBuildPanel();

    public BurgerPanel() {

        setLayout(new BorderLayout());

        JButton addBottomBreadButton = new JButton("Bottom bread");
        JButton addMiddleBreadButton = new JButton("Middle bread");
        JButton addTopBreadButton = new JButton("Top bread");
        JButton addSmallMeatButton = new JButton("Small meat");
        JButton addBigMeatButton = new JButton("Big meat");
        JButton addTomatoButton = new JButton("Tomato");
        JButton addSaladButton = new JButton("Salad");
        JButton addOnionButton = new JButton("Onion");
        JButton addPickleButton = new JButton("Pickle");
        JButton addBaconButton = new JButton("Bacon");
        JButton addMushroomButton = new JButton("Mushroom");
        JButton addEggButton = new JButton("Egg");
        JButton addCheddarButton = new JButton("Cheddar");
        JButton addGoatCheeseButton = new JButton("Goat cheese");
        JButton addGruyereButton = new JButton("Gruyere");
        JButton addKetchupButton = new JButton("Ketchup");
        JButton addMayoButton = new JButton("Mayo");

        JPanel burgerButtonsLeft = new JPanel();
        JPanel burgerButtonsRight = new JPanel();
        burgerButtonsLeft.setLayout(new GridLayout(10, 1, 0, 10));
        burgerButtonsRight.setLayout(new GridLayout(10, 1, 0, 10));

        addBottomBreadButton.addActionListener(ae -> burgerBuildPanel.addBottomBread());
        addMiddleBreadButton.addActionListener(ae -> burgerBuildPanel.addMiddleBread());
        addTopBreadButton.addActionListener(ae -> burgerBuildPanel.addTopBread());
        addSmallMeatButton.addActionListener(ae -> burgerBuildPanel.addSmallMeat());
        addBigMeatButton.addActionListener(ae -> burgerBuildPanel.addBigMeat());
        addTomatoButton.addActionListener(ae -> burgerBuildPanel.addTomato());
        addSaladButton.addActionListener(ae -> burgerBuildPanel.addSalad());
        addOnionButton.addActionListener(ae -> burgerBuildPanel.addOnion());
        addPickleButton.addActionListener(ae -> burgerBuildPanel.addPickle());
        addBaconButton.addActionListener(ae -> burgerBuildPanel.addBacon());
        addMushroomButton.addActionListener(ae -> burgerBuildPanel.addMushroom());
        addEggButton.addActionListener(ae -> burgerBuildPanel.addEgg());
        addCheddarButton.addActionListener(ae -> burgerBuildPanel.addCheddar());
        addGoatCheeseButton.addActionListener(ae -> burgerBuildPanel.addGoatCheese());
        addGruyereButton.addActionListener(ae -> burgerBuildPanel.addGruyere());
        addKetchupButton.addActionListener(ae -> burgerBuildPanel.addKetchup());
        addMayoButton.addActionListener(ae -> burgerBuildPanel.addMayo());

        burgerButtonsLeft.add(addBottomBreadButton);
        burgerButtonsLeft.add(addMiddleBreadButton);
        burgerButtonsLeft.add(addTopBreadButton);
        burgerButtonsLeft.add(addSmallMeatButton);
        burgerButtonsLeft.add(addBigMeatButton);
        burgerButtonsLeft.add(addTomatoButton);
        burgerButtonsLeft.add(addSaladButton);
        burgerButtonsLeft.add(addOnionButton);
        burgerButtonsLeft.add(addPickleButton);
        burgerButtonsRight.add(addBaconButton);
        burgerButtonsRight.add(addMushroomButton);
        burgerButtonsRight.add(addEggButton);
        burgerButtonsRight.add(addCheddarButton);
        burgerButtonsRight.add(addGoatCheeseButton);
        burgerButtonsRight.add(addGruyereButton);
        burgerButtonsRight.add(addKetchupButton);
        burgerButtonsRight.add(addMayoButton);

        JButton bakeButton = new JButton("Bake");
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        bottom.add(bakeButton);
        bakeButton.addActionListener(ae -> burgerBuildPanel.bake());

        add(burgerBuildPanel, BorderLayout.CENTER);
        add(burgerButtonsLeft, BorderLayout.WEST);
        add(burgerButtonsRight, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);
    }
}
