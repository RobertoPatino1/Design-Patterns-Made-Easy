package builder.concreteBuilders;

import builder.Pizza;
import builder.PizzaBuilder;

public class PepperoniPizza extends PizzaBuilder {
    private Pizza result;

    @Override
    public void buildMace() {
        result.setMace("Soft");
    }

    @Override
    public void buildSalsa() {
        result.setSalsa("Tomato salsa");
    }

    @Override
    public void buildFilling() {
        result.setFilling("Pepperoni, Cheese");        
    }

    public Pizza getResult(){
        return result;
    }
}
