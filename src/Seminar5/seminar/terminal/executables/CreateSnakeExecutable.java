package Seminar5.seminar.terminal.executables;


import Seminar5.seminar.animals.Snake;

import Seminar5.seminar.terminal.command.Command;
import Seminar5.seminar.zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{


        private Zoo zoo;
        private Snake snake;

        public CreateSnakeExecutable(Zoo zoo, Command command) {
            this.zoo = zoo;
            this.snake = new Snake(command);
        }

        @Override
        public void execute() {
            this.zoo.addSnake(this.snake);
        }
}
