package baseball.model;

import baseball.common.util.ConstVariable;

public class Status {
    private boolean gameStatus;
    private boolean generateNumberStatus;

    public Status() {
        initGameStatus();
        this.generateNumberStatus = ConstVariable.GENERATE_NUMBERS_CONTINUE;
    }

    public void setGameStatus(int userInput) {
        if (userInput == ConstVariable.USER_INPUT_INTEGER_ONE) {
            this.generateNumberStatus = ConstVariable.GENERATE_NUMBERS_CONTINUE;
        } else if (userInput == ConstVariable.USER_INPUT_INTEGER_TWO) {
            this.gameStatus = ConstVariable.GAME_STOP;
        }
    }

    public boolean getGameStatus() {
        return gameStatus;
    }

    public boolean getGenerateNumberStatus() {
        return generateNumberStatus;
    }

    public void initGameStatus() {
        gameStatus = ConstVariable.GAME_CONTINUE;
    }

    public void initGenerateNumberStatus() {
        generateNumberStatus = ConstVariable.GENERATE_NUMBERS_STOP;
    }
}
