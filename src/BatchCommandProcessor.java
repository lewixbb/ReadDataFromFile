import InputData.DataCollector;
import OutputData.PrintData;
import ProcessAlgorithm.CommandDef;

public class BatchCommandProcessor {


    public void execute() {

        DataCollector dc = new DataCollector();
        PrintData<CommandDef> pd = new PrintData<>();

        pd.printListToConsole(dc.collectDataFromFile());

    }
}
