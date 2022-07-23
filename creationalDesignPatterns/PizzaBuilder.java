package builder;

public abstract class PizzaBuilder {
    //Abstract class used to define the methods that every concrete builder needs to have.
    //Can also be declared as an interface....
    protected Pizza result;
    public abstract void buildMace();

    public abstract void buildSalsa();

    public abstract void buildFilling();

    public Pizza getResult(){
        return result;
    }
    


    


}
