package Seminar5.seminar.terminal.executables;


import Seminar5.seminar.animals.Lion;
import Seminar5.seminar.animals.Wolf;
import Seminar5.seminar.terminal.command.Command;

import Seminar5.seminar.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {


        private Zoo zoo;
        private Wolf wolf;

        public CreateWolfExecutable(Zoo zoo, Command command) {
            this.zoo = zoo;
            this.wolf = new Wolf(command);
        }

        @Override
        public void execute() {
            this.zoo.addWolf(this.wolf);
        }

}
