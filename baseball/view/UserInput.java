package baseball.view;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public String inputUserNumbers() {
        System.out.println();
        Message.INPUT_NUMBER.print();
        return sc.nextLine();
    }

    public int inputUserNum() {
        return sc.nextInt();
    }
}
