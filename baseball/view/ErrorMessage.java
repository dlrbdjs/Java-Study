package baseball.view;

public enum  ErrorMessage {
    INPUT_ERROR_LENGTH("정수를 3개 입력하세요"),
    INPUT_ERROR_TYPE("정수만 입력하세요"),
    INPUT_ERROR_SAME("서로 다른 정수를 입력하세요");


    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void println() {
        System.out.println(this.errorMessage);
    }
}