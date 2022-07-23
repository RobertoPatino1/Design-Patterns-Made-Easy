package builder;

public interface Builder {

    //Builder methods
    Pizza getResult();

    void setMace(String mace);

    void setSalsa(String salsa);

    void setFilling(String filling);
    
}
