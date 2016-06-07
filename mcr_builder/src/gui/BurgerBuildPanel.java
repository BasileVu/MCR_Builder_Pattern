package gui;

import builder.BurgerBuilder;
import exceptions.MissingBaseException;
import exceptions.MissingTopException;
import ingredient.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sebbos on 07.06.2016.
 */
public class BurgerBuildPanel extends JPanel {

    final JLabel label = new JLabel(); // FIXME : only there to test
    final BurgerBuilder builder;

    public BurgerBuildPanel() {
        setPreferredSize(new Dimension(600, 600));
        add(label);
        builder = new BurgerBuilder();
    }

    public void addBottomBread() {
        builder.buildBase();
        label.setText(buildProgressBurger());
    }

    public void addMiddleBread() {
        builder.addIngredient(new Bread());
        label.setText(buildProgressBurger());
    }

    public void addTopBread() {
        builder.buildTop();
        label.setText(buildProgressBurger());
    }

    public void addMayo() {
        builder.addIngredient(new Mayo());
        label.setText(buildProgressBurger());
    }

    public void addMeat() {
        builder.addIngredient(new Meat());
        label.setText(buildProgressBurger());
    }

    public void addTomato() {
        builder.addIngredient(new Tomato());
        label.setText(buildProgressBurger());
    }

    public void addSalad() {
        builder.addIngredient(new Salad());
        label.setText(buildProgressBurger());
    }

    public void addOnion() {
        builder.addIngredient(new Onion());
        label.setText(buildProgressBurger());
    }

    public void addPickle() {
        builder.addIngredient(new Pickle());
        label.setText(buildProgressBurger());
    }

    public void addBacon() {
        builder.addIngredient(new Bacon());
        label.setText(buildProgressBurger());
    }

    public void addMushroom() {
        builder.addIngredient(new Mushroom());
        label.setText(buildProgressBurger());
    }

    public void addEgg() {
        builder.addIngredient(new Egg());
        label.setText(buildProgressBurger());
    }

    public void addCheddar() {
        builder.addIngredient(new Cheese("Cheddar", 1));
        label.setText(buildProgressBurger());
    }

    public void addGoatCheese() {
        builder.addIngredient(new Cheese("Goat cheese", 2));
        label.setText(buildProgressBurger());
    }

    public void addGruyere() {
        builder.addIngredient(new Cheese("Gruyere", 1));
        label.setText(buildProgressBurger());
    }

    public void addKetchup() {
        builder.addIngredient(new Ketchup());
        label.setText(buildProgressBurger());
    }

    public void bake() {
        builder.bake();
        label.setText(buildProgressBurger());
    }

    public void getProduct() {
        label.setText(buildBurger());
    }

    // FIXME
    private String buildProgressBurger() {
        try {
            return builder.getProgress().toString();
        }
        catch (MissingBaseException e) {
            System.err.println("Missing base"); // FIXME
        }

        return "";
    }

    private String buildBurger() {
        try {
            return builder.getBurger().toString();
        }
        catch (MissingBaseException e) {
            System.err.println("Missing base"); // FIXME
        } catch (MissingTopException e) {
            System.err.println("Missing Top"); // FIXME
        }

        return "";
    }
}