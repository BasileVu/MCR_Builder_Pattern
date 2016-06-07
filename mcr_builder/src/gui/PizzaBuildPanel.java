package gui;

import builder.PizzaBuilder;
import exceptions.MissingBaseException;
import ingredient.Cheese;
import ingredient.Onion;
import ingredient.Tomato;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Basile Vu on 07.06.2016.
 */
public class PizzaBuildPanel extends JPanel {

    final JLabel label = new JLabel(); // FIXME : only there to test
    final PizzaBuilder builder;

    public PizzaBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        add(label);
        builder = new PizzaBuilder();
    }

    public void buildBase() {
        builder.buildBase();
        label.setText(buildPizza());
    }

    public void addTomato() {
        builder.addIngredient(new Tomato());
        label.setText(buildPizza());
    }

    public void addMozzarella() {
        builder.addIngredient(new Cheese("Mozzarella", 1));
        label.setText(buildPizza());
    }

    public void addOnion() {
        builder.addIngredient(new Onion());
        label.setText(buildPizza());
    }

    public void bake() {
        builder.bake();
        label.setText(buildPizza());
    }

    // FIXME
    private String buildPizza() {
        try {
            return builder.getPizza().toString();
        } catch (MissingBaseException e) {
            System.err.println("Missing dough"); // FIXME
        }
        return "";
    }
}
