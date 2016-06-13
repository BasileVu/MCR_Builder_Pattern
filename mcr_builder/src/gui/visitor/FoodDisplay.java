package gui.visitor;

import gui.pizzaIngredient.MiddleBread;
import ingredient.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public interface FoodDisplay {
    default void visit(Dough dough) {
        throw new NotImplementedException();
    }

    default void visit(BottomBread bottomBread) {
        throw new NotImplementedException();
    }

    default void visit(MiddleBread middleBread) {
        throw new NotImplementedException();
    }

    default void visit(TopBread topBread) {
        throw new NotImplementedException();
    }

    default void visit(Meat meat) {
        throw new NotImplementedException();
    }

    default void visit(Salad salad) {
        throw new NotImplementedException();
    }

    default void visit(Onion onion){
        throw new NotImplementedException();
    }

    default void visit(Pickle pickle) {
        throw new NotImplementedException();
    }

    default void visit(Cheddar cheddar) {
        throw new NotImplementedException();
    }

    default void visit(Egg egg) {
        throw new NotImplementedException();
    }

    default void visit(Gruyere gruyere) {
        throw new NotImplementedException();
    }

    default void visit(Tomato tomato) {
        throw new NotImplementedException();
    }

    default void visit(Ketchup ketchup) {
        throw new NotImplementedException();
    }

    default void visit(Mayo mayo) {
        throw new NotImplementedException();
    }

    default void visit(Mozzarella mozzarella) {
        throw new NotImplementedException();
    }

    default void visit(Basil basil) {
        throw new NotImplementedException();
    }

    default void visit(TomatoSauce tomatoSauce) {
        throw new NotImplementedException();
    }

    default void visit(Olives olives) {
        throw new NotImplementedException();
    }

    default void visit(Mushrooms mushrooms) {
        throw new NotImplementedException();
    }
}
