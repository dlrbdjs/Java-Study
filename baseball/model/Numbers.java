//import java.util.Arrays;
package baseball.model;

import java.util.Random;
import baseball.common.util.ConstVariable;
import baseball.controller.UserInput;

public class Numbers {
    public int[] userNums = new int[ConstVariable.maxNumListLength];
    public int[] randomNums = new int[ConstVariable.maxNumListLength];

    public void getRandNums() {
        Random random = new Random();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            int idx = random.nextInt(ConstVariable.randomNumBound);
            while(nums[idx] == 0){
                idx = idx * 2 % nums.length;
            }
            randomNums[i] = nums[idx];
            nums[idx] = 0;
        }
    }

    public void getUserNums() {
        UserInput userInput = new UserInput();
        userNums = userInput.inputUserNums();
    }

//    public void initUserNums(){
//        Arrays.fill(userNums, 0);
//    }
}
