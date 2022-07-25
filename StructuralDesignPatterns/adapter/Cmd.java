package StructuralDesignPatterns.adapter;

public class Cmd implements Terminal{
    //This class implements the target interface, the client knows how to use it


    @Override
    public void changeDirectory() {
        System.out.println("Changing windows directory");
        
    }

    @Override
    public void listFiles() {
        System.out.println("Showing all files and folders");
        
    }

    @Override
    public void print() {
        System.out.println("Showing the result of printing something");
        
    }

    
    
}
