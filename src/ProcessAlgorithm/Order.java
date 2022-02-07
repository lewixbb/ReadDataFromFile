package ProcessAlgorithm;

import java.util.Arrays;

public class Order extends CommandDef<String,String> {

    @Override
    public void execute() {

        setResult(collectIntoOne(moveRow(separateStrings(getData()))));

    }

    private String [] separateStrings(String s){
        return s.split(" ");
    }

    private String [] moveRow (String [] S){

        String lastRow = S[S.length-1];

        for (int i = S.length-1; i > 0; i--) {
            S[i] = S[i-1];
        }
        S[0] = lastRow;

        return  S;
    }

    private String collectIntoOne(String [] S){

        return Arrays.stream(S).reduce("",(a,b)->a+" "+b);
    }

}
