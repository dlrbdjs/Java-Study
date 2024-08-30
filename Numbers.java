import java.util.Arrays;

public class Numbers {
    int[] userNums = new int[ConstVariable.maxNumListLength];
    int[] randomNums = new int[ConstVariable.maxNumListLength];

    public void initUserNums(){
        Arrays.fill(userNums, 0);
    }
}
