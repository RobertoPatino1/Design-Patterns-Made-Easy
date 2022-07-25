package StructuralDesignPatterns.adapter;

public class Client {
    public static void main(String[] args) {
        Terminal cmd = new Cmd();
        System.out.println("------Windows terminal------");
        cmd.changeDirectory();
        cmd.print();
        cmd.listFiles();

        //Now we can use the linuxterminal with the commands on the Terminal interface

        TerminalAdapter terminalAdapter = new TerminalAdapter(new LinuxTerminal());
        System.out.println("------Linux terminal------");
        terminalAdapter.changeDirectory();  //calls cd()
        terminalAdapter.print();    //calls cat()
        terminalAdapter.listFiles();    //Calls ls()
    }

    

    
    
}
