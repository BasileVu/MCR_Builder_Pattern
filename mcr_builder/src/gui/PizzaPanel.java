package gui;

import builder.PizzaBuilder;
import exceptions.MissingBaseException;
import ingredient.Cheese;
import ingredient.Onion;
import ingredient.Tomato;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 06.06.2016.
 */
public class PizzaPanel extends JPanel {
    JLabel label = new JLabel(); // FIXME : only there to test
    PizzaBuilder builder;

    public PizzaPanel() {
        setPreferredSize(new Dimension(600, 600));
        add(label);

        builder = new PizzaBuilder();
    }

    public void buildBase() {
        builder.buildBase();

        try {
            label.setText(builder.getPizza().toString());
        } catch(MissingBaseException e) {
            System.err.println("Missing dough"); // FIXME
        }
    }

    public void addTomato() {
        builder.addIngredient(new Tomato());
        try {
            label.setText(builder.getPizza().toString());
        } catch (MissingBaseException e) {
            System.err.println("Missing dough"); // FIXME
        }
    }

    public void addMozzarella() {
        builder.addIngredient(new Cheese("Mozzarella", 1));
        try {
            label.setText(builder.getPizza().toString());
        } catch (MissingBaseException e) {
            System.err.println("Missing dough"); // FIXME
        }
    }

    public void addOnion() {
        builder.addIngredient(new Onion());
        try {
            label.setText(builder.getPizza().toString());
        } catch (MissingBaseException e) {
            System.err.println("Missing dough"); // FIXME
        }
    }

    public void bake() {
        builder.bake();
        try {
            label.setText(builder.getPizza().toString());
        } catch (MissingBaseException e) {
            System.err.println("Missing dough"); // FIXME
        }
    }
}
