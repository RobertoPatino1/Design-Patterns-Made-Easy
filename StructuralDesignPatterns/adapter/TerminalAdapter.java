package StructuralDesignPatterns.adapter;

public class TerminalAdapter implements Terminal {
    /*
     * this class will be the adapter, as it will help the cliente use the LinuxTerminal
     * methods the way it is used to call the Terminal interface methods
     * 
     * Note that there is no need to change the code in the LinuxTerminal class 
     */

     private LinuxTerminal adaptee;

    public TerminalAdapter(LinuxTerminal adaptee){
        this.adaptee = adaptee;
    }

    //Implementing the Terminal methods
    @Override
    public void changeDirectory() {
        adaptee.cd();
        
    }

    @Override
    public void listFiles() {
        adaptee.ls();
        
    }

    @Override
    public void print() {
        adaptee.cat();
        
    }

    
    
}
