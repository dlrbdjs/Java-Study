package baseball.view;

public enum Message {
    START_GAME("숫자 야구 게임을 시작합니다."),
    INPUT_NUMBER("숫자를 입력해주세요 : "),
    NOTHING("낫싱"),
    BALL("볼 "),
    STRIKE("스트라이크"),
    END_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART_GAME("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public void print() {
        System.out.print(this.message);
    }

    public void print(int num) {
        System.out.print(num);
        this.print();
    }

    public void println() {
        System.out.print(this.message);
        System.out.println();
    }

//    public void printlnFront() {
//        System.out.println();
//        System.out.print(this.message);
//    }
}
