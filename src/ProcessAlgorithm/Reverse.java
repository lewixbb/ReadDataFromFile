package ProcessAlgorithm;

public class Reverse extends CommandDef<String,String> {

    @Override
    public void execute() {

        setResult(margeRotated(cutIntoLetter(getData())));

    }

    private String [] cutIntoLetter (String s){
        return s.split("");
    }

    private String margeRotated (String [] S){

        String result = "";

        for (int i = S.length-1; i >= 0; i--) {
            result = result + S[i];
        }
        return result;
    }

}
