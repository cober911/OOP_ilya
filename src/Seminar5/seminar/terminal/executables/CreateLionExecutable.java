package Seminar5.seminar.terminal.executables;

import Seminar5.seminar.animals.Lion;
import Seminar5.seminar.terminal.command.Command;
import Seminar5.seminar.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {

    private Zoo zoo;
    private Lion lion;

    public CreateLionExecutable(Zoo zoo, Command command) {
        this.zoo = zoo;
        this.lion = new Lion(command);
    }

    @Override
    public void execute() {
        this.zoo.addLion(this.lion);
    }
}
