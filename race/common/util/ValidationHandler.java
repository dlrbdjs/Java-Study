package race.common.util;

import race.view.Message;

import java.util.Arrays;

import static race.common.util.ConstVariable.MAX_NAME_LENGTH;

public class ValidationHandler {
    public String[] validateName(String[] names){
        Arrays.stream(names)
                .filter(name -> name.length() > MAX_NAME_LENGTH)
                .findAny()
                .ifPresent(this::throwArgException);
        return names;
    }

    public void throwArgException(String str){
        throw new IllegalArgumentException(str + Message.INPUT_ERROR);
    }
}
