public class PrintList {
    public void answerPrint(int[] list){
        System.out.print("정답: ");
        for (int i = 0; i < 3; i++){
            System.out.printf("%d", list[i]);
        }
        System.out.println();
    }
}
