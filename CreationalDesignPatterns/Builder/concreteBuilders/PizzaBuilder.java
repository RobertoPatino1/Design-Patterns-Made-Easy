package builder.concreteBuilders;

import builder.Builder;
import builder.Pizza;

public class PizzaBuilder implements Builder{
    private Pizza result;
    private String mace;
    private String salsa;
    private String filling;
    
    @Override
    public void setMace(String mace) {
        this.mace = mace;
        
    }
    @Override
    public void setSalsa(String salsa) {
        this.salsa = salsa;
        
    }
    @Override
    public void setFilling(String filling) {
        this.filling = filling;
        
    }


    public Pizza getResult(){
        result = new Pizza(mace, salsa, filling);
        return result;
    }

    



}
