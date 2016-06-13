package gui.visitor;

import gui.pizzaIngredient.MiddleBread;
import ingredient.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public interface FoodDisplay {
    default void visit(Dough t) {
        throw new NotImplementedException();
    }

    default void visit(BottomBread t) {
        throw new NotImplementedException();
    }

    default void visit(MiddleBread t) {
        throw new NotImplementedException();
    }

    default void visit(TopBread t) {
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

    default void visit(Tomato t) {
        throw new NotImplementedException();
    }

    default void visit(Ketchup t) {
        throw new NotImplementedException();
    }

    default void visit(Mayo t) {
        throw new NotImplementedException();
    }
}
