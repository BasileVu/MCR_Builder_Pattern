package gui.panels;

import javax.swing.*;
import java.awt.*;

/**
 * Contains the view of the burger being built and the buttons to modify it.
 */
public class BurgerPanel extends JPanel {

    final BurgerBuildPanel burgerBuildPanel = new BurgerBuildPanel();

    public BurgerPanel() {

        setLayout(new BorderLayout());

        JButton addBottomBreadButton = new JButton("Bottom bread");
        JButton addMiddleBreadButton = new JButton("Middle bread");
        JButton addTopBreadButton = new JButton("Top bread");
        JButton addMeatButton = new JButton("Meat");
        JButton addTomatoButton = new JButton("Tomato");
        JButton addSaladButton = new JButton("Salad");
        JButton addOnionButton = new JButton("Onion");
        JButton addPickleButton = new JButton("Pickle");
        JButton addEggButton = new JButton("Egg");
        JButton addCheddarButton = new JButton("Cheddar");
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
        addMeatButton.addActionListener(ae -> burgerBuildPanel.addMeat());
        addTomatoButton.addActionListener(ae -> burgerBuildPanel.addTomato());
        addSaladButton.addActionListener(ae -> burgerBuildPanel.addSalad());
        addOnionButton.addActionListener(ae -> burgerBuildPanel.addOnion());
        addPickleButton.addActionListener(ae -> burgerBuildPanel.addPickle());
        addEggButton.addActionListener(ae -> burgerBuildPanel.addEgg());
        addCheddarButton.addActionListener(ae -> burgerBuildPanel.addCheddar());
        addGruyereButton.addActionListener(ae -> burgerBuildPanel.addGruyere());
        addKetchupButton.addActionListener(ae -> burgerBuildPanel.addKetchup());
        addMayoButton.addActionListener(ae -> burgerBuildPanel.addMayo());

        burgerButtonsLeft.add(addBottomBreadButton);
        burgerButtonsLeft.add(addMiddleBreadButton);
        burgerButtonsLeft.add(addTopBreadButton);
        burgerButtonsLeft.add(addMeatButton);
        burgerButtonsLeft.add(addTomatoButton);
        burgerButtonsLeft.add(addSaladButton);
        burgerButtonsLeft.add(addOnionButton);
        burgerButtonsRight.add(addPickleButton);
        burgerButtonsRight.add(addEggButton);
        burgerButtonsRight.add(addCheddarButton);
        burgerButtonsRight.add(addGruyereButton);
        burgerButtonsRight.add(addKetchupButton);
        burgerButtonsRight.add(addMayoButton);

        JButton bakeButton = new JButton("Bake");
        JButton getProductButton = new JButton("Get product");
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridBagLayout());
        bottom.add(bakeButton);
        bottom.add(getProductButton);
        bakeButton.addActionListener(ae -> burgerBuildPanel.bake());
        getProductButton.addActionListener(ae -> burgerBuildPanel.getProduct());


        add(burgerBuildPanel, BorderLayout.CENTER);
        add(burgerButtonsLeft, BorderLayout.WEST);
        add(burgerButtonsRight, BorderLayout.EAST);
        add(bottom, BorderLayout.SOUTH);
    }
}
