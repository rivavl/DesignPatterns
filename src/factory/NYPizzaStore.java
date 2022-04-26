package factory;

import factory.ingredient.PizzaIngredientFactory;
import factory.ingredient.ny.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

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
