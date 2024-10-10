package race.view;

import java.util.Scanner;

import static race.common.util.ConstVariable.COMMA;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public String[] inputName() {
        Message.START_GAME.println();
        return sc.nextLine().split(COMMA);
    }

    public int inputAttempts() {
        Message.INPUT_ATTEMPTS.println();
        return sc.nextInt();
    }
}
