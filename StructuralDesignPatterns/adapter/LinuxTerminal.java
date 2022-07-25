package StructuralDesignPatterns.adapter;

public class LinuxTerminal {
    

    //LinuxTerminal is not known by the client


    //Its methods are not compatible with the Teminal interface, as they have different names
    //and might have a different list of parameters
    public void ls(){
        System.out.println("Listing all the files");
    }
    public void cd(){
        System.out.println("Changing directory");
    }

    public void cat(){
        System.out.println("Showing the content of this file...");
    }
}
