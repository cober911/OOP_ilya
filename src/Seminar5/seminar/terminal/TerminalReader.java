package Seminar5.seminar.terminal;

import Seminar5.seminar.terminal.factory.CommandExecutableFactory;
import Seminar5.seminar.terminal.factory.CommandExecutableFactoryImpl;
import Seminar5.seminar.terminal.command.Command;
import Seminar5.seminar.terminal.command.CommandParser;
import Seminar5.seminar.zoo.Zoo;

import static Seminar5.seminar.terminal.menu.FillParametersFromMenu.callMenu;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;
    private Zoo zoo;

    private TerminalReader(CommandParser commandParser,Zoo zoo) {
        this.commandParser = commandParser;
        this.zoo = zoo;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser, Zoo zoo) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser,zoo);
        }
        return terminalReader;
    }


    public void endless() {
        while(true) {
            Command terminalCommand = this.commandParser.parseCommand(callMenu());
            CommandExecutableFactory commandExecutableFactory= new CommandExecutableFactoryImpl();
            commandExecutableFactory.createCommandExecutable(this.zoo, terminalCommand);
            commandExecutableFactory.getCommandExecutable().execute();
            System.out.println(this.zoo);
        }
    }
}
