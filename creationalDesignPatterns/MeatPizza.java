package builder.concreteBuilders;

import builder.Pizza;
import builder.PizzaBuilder;

public class MeatPizza implements PizzaBuilder {
    private Pizza result;

    @Override
    public void buildMace() {
        result.setMace("Cooked");
    }

    @Override
    public void buildSalsa() {
        result.setSalsa("Tomato with spicy chilli");
    }

    @Override
    public void buildFilling() {
        result.setFilling("Meat, Cheese");
    }

    public Pizza getResult(){
        return result;
    }
}
