package race.controller;

import race.view.Message;

public class ValidationHandler {
    public void throwIllegalArgumentException(String[] names){
        for(String name : names){
            if(name.length() > 5){
                throw new IllegalArgumentException(Message.INPUT_ERROR.toString());
            }
        }
    }
    public String[] validateName(String[] names){
        try{
            throwIllegalArgumentException(names);
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
        return names;
    }
}
