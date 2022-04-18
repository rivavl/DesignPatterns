package decorator.coffee;

import decorator.abs_class.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
