package builder.director;

import builder.Builder;

public class Kitchen {
    private Builder builder;

    public Kitchen(Builder builder){
        this.builder = builder;
    }

    //Building methdos aplied
    public void buildHawaiianPizza(){
        builder.setMace("Soft");
        builder.setSalsa("Sweet pineaple salsa");
        builder.setFilling("Pineaple slices, cheese");
    }

    public void buildPepperoniPizza(){
        builder.setMace("Cooked");
        builder.setSalsa("Traditional salsa");
        builder.setFilling("Pepperoni slices, cheese");
    }

    public void buildMeatPizza(){
        builder.setMace("Cooked");
        builder.setSalsa("Spicy chilli salsa");
        builder.setFilling("Meat, cheese, ham");
    }


    public Pizza getPizza(){
        return builder.getResult();
    }

}
