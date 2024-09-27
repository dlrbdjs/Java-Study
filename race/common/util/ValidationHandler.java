package race.common.util;

import race.view.Message;

import java.util.Arrays;

public class ValidationHandler {
    public String[] validateName(String[] names){
        Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .findAny()
                .ifPresent(name -> {
                    throw new IllegalArgumentException(name + Message.INPUT_ERROR);
                });
        return names;
    }
}
