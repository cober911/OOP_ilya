package Seminar5.seminar.terminal;

import Seminar5.seminar.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.createLions(4);
    }
}
