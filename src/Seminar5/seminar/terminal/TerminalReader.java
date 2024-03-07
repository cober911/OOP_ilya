package Seminar5.seminar.terminal;

import java.util.Scanner;

public class TerminalReader{
    private CommandParser commandParser;
    private static TerminalReader terminalReader;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader getCommandParser(CommandParser commandParser){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public void endLess(){
        Scanner scan = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")){
            input = scan.nextLine();
        }
        scan.close();
    }
}
