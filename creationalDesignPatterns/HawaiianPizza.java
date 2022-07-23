package builder.concreteBuilders;

import builder.Pizza;
import builder.PizzaBuilder;

public class HawaiianPizza extends PizzaBuilder{
    private Pizza result;

    @Override
    public void buildMace() {
        result.setMace("Soft");
        
    }

    @Override
    public void buildSalsa() {
        result.setSalsa("Sweet pineaple salsa");
        
    }

    @Override
    public void buildFilling() {
        result.setFilling("Pineaple slices, Cheese, ham slices");
        
    }




}
