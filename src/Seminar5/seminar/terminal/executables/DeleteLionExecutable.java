package Seminar5.seminar.terminal.executables;

import Seminar5.seminar.terminal.command.Command;
import Seminar5.seminar.zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {

    private Zoo zoo;
    private int lionMane;

    public DeleteLionExecutable(Zoo zoo, Command command) {
        this.zoo = zoo;
        this.lionMane = command.getCommandParameters().get(2);
    }



    @Override
    public void execute() {
       this.zoo.takeOffLion(this.lionMane);
    }
}
