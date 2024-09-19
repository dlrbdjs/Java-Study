package race.view;

public enum Message {
    START_GAME("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)"),
    INPUT_ATTEMPTS("시도할 회수는 몇회인가요?"),
    GAME_RESULT("실행 결과"),
    RACE_RESULT_COLON(" : "),
    RACE_RESULT_DASH("-"),
    RACE_WINNER("최종 우승자 : ");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public void print() {
        System.out.print(this.message);
    }

    public void print(String str, boolean enumFirst){
        if(enumFirst){
            System.out.printf("%s", str);
            this.print();
        }else{
            this.print();
            System.out.printf("%s", str);
        }
    }

    public void println() {
        System.out.print(this.message);
        System.out.println();
    }

}
