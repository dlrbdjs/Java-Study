public class Check {

    public boolean length(int[] inputList){
        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            if(inputList[i] == 0) {return false;}
        }
        return true;
    }

    public boolean sameNumber(int[] inputList) {
        for (int i = 0; i < ConstVariable.maxNumListLength; i++) {
            for (int j = i+1; j < ConstVariable.maxNumListLength; j++) {
                if(inputList[i] == inputList[j]) {return false;}
            }
        }
        return true;
    }
}
