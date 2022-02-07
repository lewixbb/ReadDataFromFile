package ProcessAlgorithm;

import java.util.*;

public class Sum extends CommandDef<String,Integer> {

    @Override
    public void execute() {
       setResult(sumResult(fromSpringToNumbers(separateStrings(getData()))));
    }

    private String[] separateStrings (String S){
        return S.split(" ");
    }

    private int[] fromSpringToNumbers (String [] S){

        return Arrays.stream(S).mapToInt(s->Integer.parseInt(s)).toArray();
    }

    private int sumResult (int [] input){

        return Arrays.stream(input).reduce(0,(a,b)->a+b);
    }

}
