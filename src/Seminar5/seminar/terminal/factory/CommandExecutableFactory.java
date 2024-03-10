package Seminar5.seminar.terminal.factory;

import Seminar5.seminar.terminal.command.Command;
import Seminar5.seminar.terminal.executables.CommandExecutable;
import Seminar5.seminar.zoo.Zoo;

public interface CommandExecutableFactory{
    public void createCommandExecutable(Zoo zoo, Command command);

    public CommandExecutable getCommandExecutable();
}
