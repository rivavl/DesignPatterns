package factory.chicagoStyle;

import factory.*;
import factory.ingredient.PizzaIngredientFactory;
import factory.ingredient.chicago.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza(ingredientFactory);
            case "pepperoni" -> new PepperoniPizza(ingredientFactory);
            case "clam" -> new ClamPizza(ingredientFactory);
            case "veggie" -> new VeggiePizza(ingredientFactory);
            default -> null;
        };
    }
}
