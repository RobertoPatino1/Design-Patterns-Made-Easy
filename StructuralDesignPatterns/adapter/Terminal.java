package StructuralDesignPatterns.adapter;

public interface Terminal {

    //Target interface
    
    void changeDirectory();
    void listFiles();
    void print();

}
