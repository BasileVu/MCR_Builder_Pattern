import director.Pizzaiolo;
import product.Pizza;

/**
 * Created by Basile Vu on 29.05.2016.
 */
public class Launcher {
    public static void main(String... args) {
        Pizza p = new Pizzaiolo().build();
        System.out.println(p);
    }
}
