package gui;

import builder.PizzaBuilder;
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
        label.setText(builder.getPizza().toString());
    }

    public void addTomato() {
        builder.addIngredient(new Tomato());
        label.setText(builder.getPizza().toString());
    }

    public void addMozzarella() {
        builder.addIngredient(new Cheese("Mozzarella", 1));
        label.setText(builder.getPizza().toString());
    }

    public void addOnion() {
        builder.addIngredient(new Onion());
        label.setText(builder.getPizza().toString());
    }

    public void bake() {
        builder.bake();
        label.setText(builder.getPizza().toString());
    }
}
