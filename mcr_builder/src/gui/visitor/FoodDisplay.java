package gui.visitor;

import ingredient.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Basile Vu on 13.06.2016.
 */
public interface FoodDisplay {
    default void visit(Tomato t) {
        throw new NotImplementedException();
    }

    // TODO
    void visit(BottomBread t);

    // TODO
    void visit(Meat meat);

    void visit(Salad salad);

    void visit(Onion onion);

    void visit(Pickle pickle);

    void visit(Cheddar cheddar);

    void visit(Egg egg);

    void visit(Gruyere gruyere);
}
