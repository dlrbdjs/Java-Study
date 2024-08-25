import java.util.Scanner;

public class UserInput {
    private Numbers numbers;
    UserInput() {}
    UserInput(Numbers numbers) {
        this.numbers = numbers;
    }

    public void inputUserNums(){
        Scanner sc = new Scanner(System.in);
        Check check = new Check();
//        int[] userNum = new int[ConstVariable.maxNumListLength];

        do{
            System.out.println();
            System.out.print("숫자를 입력해주세요: ");
            String userInput = sc.nextLine();
            numbers.initUserNums();
            for (int i = 0; i < userInput.length(); i++) {
                numbers.userNums[i] = Character.getNumericValue(userInput.charAt(i));
            }
        }while(!(check.length(numbers.userNums) && check.sameNumber(numbers.userNums)));

//        return numbers.userNums;
    }

    public int inputUserNum(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
