package builder;

public class Pizza {
    private String mace;
    private String salsa;
    private String filling;

    public Pizza(String mace, String salsa, String filling){
        this.mace = mace;
        this.salsa = salsa;
        this.filling = filling;
    }



    public String toString(){
        return "Mace: "+mace+"\nSalsa: "+salsa+"\nFilling: "+filling;
    }
}
