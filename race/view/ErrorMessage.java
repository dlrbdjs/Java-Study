package race.view;

public enum ErrorMessage {
    INPUT_ERROR_LENGTH(" / 이름 길이 오류 : 5자리를 초과해서 입력할 수 없습니다."),
    INPUT_ERROR_SPACE(" / 이름 서식 오류 : 맨 첫 글자는 공백일 수 없습니다."),
    INPUT_ERROR_SAME(" / 이름 중복 오류 : 이름을 중복 입력할 수 없습니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void print() {
        System.out.print(this.errorMessage);
    }

    public void println(){
        System.out.print(this.errorMessage);
        System.out.println();
    }

}
