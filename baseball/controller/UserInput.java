package baseball.controller;

import java.util.Scanner;
import baseball.view.Message;
import baseball.common.util.ConstVariable;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public int[] inputUserNums(){
        System.out.println();
        Message.INPUT_NUMBER.print();
        return convertIntList(sc.nextLine());
    }

    public int[] convertIntList(String str){
        int[] nums = new int[ConstVariable.maxNumListLength];
        for (int i = 0; i < str.length(); i++) {
            nums[i] = Character.getNumericValue(str.charAt(i));
        }
        return nums;
    }

    public int inputUserNum(){
        return sc.nextInt();
    }
}
