package ProcessAlgorithm;

import java.util.Arrays;

public class CC extends CommandDef<String,String> {

    @Override
    public void execute() {
        setResult(connectIntoOne(toUpperCase(stringToArray(data))));
    }

    private String [] stringToArray(String s){

        return s.split("[ ]");
    }

    private String[] toUpperCase(String [] s){

        for (int i = 1; i < s.length; i++) {

            s[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1);
        }

        return s;
    }

    private String connectIntoOne (String [] S) {

        return Arrays.stream(S).reduce("",(a,b)->a+b);
    }
}
