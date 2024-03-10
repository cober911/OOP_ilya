package Seminar5.seminar.terminal.factory;

import Seminar5.seminar.terminal.command.Command;
import Seminar5.seminar.zoo.Zoo;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl{

    @Override
    public void createCommandExecutable(Zoo zoo, Command command) {
        System.out.println("Start");
        super.createCommandExecutable(zoo, command);
        System.out.println("End");

    }
}
