package Seminar5.seminar.terminal;

import Seminar5.seminar.zoo.Zoo;

public class DeleteLionExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteLionExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.getLion();
    }
}
