package decorator.condiment;

import decorator.abs_class.Beverage;
import decorator.abs_class.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .05;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .10;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .25;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
