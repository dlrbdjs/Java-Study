package baseball.controller;

import java.util.Scanner;

import baseball.view.Message;

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
