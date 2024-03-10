package Seminar5.seminar.terminal.executables;

import Seminar5.seminar.terminal.command.Command;
import Seminar5.seminar.zoo.Zoo;

public class DeleteSnakeExecutable implements CommandExecutable {

        private Zoo zoo;
        private int bodyLength;

        public DeleteSnakeExecutable(Zoo zoo, Command command) {
            this.zoo = zoo;
            this.bodyLength = command.getCommandParameters().get(2);
        }



        @Override
        public void execute() {
            this.zoo.takeOffSnake(this.bodyLength);
        }
}
