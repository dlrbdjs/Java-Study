package race.common.util;

import race.view.Message;

public class ValidationHandler {
    public String[] validateName(String[] names){
        for(String name : names){
            if(name.length() > 5){
                throw new IllegalArgumentException(Message.INPUT_ERROR.toString());
            }
        }
        return names;
    }
}
