package InputData;

import ProcessAlgorithm.*;
import java.util.ArrayList;

public class DataCollector {

    ReadFromFile rf = new ReadFromFile();
    ArrayList<CommandDef> collectedData = new ArrayList<>();


    public ArrayList<CommandDef> collectDataFromFile(){

        ArrayList<DataFormat> dataInputList = rf.read();

        for (DataFormat df: dataInputList) {

            switch (df.getAlgorithmName()) {

                case "SUM":
                    CommandDef sum = new Sum();
                    sum.setData(df.getDataBeforeMod());
                    sum.execute();
                    collectedData.add(sum);
                    break;
                case "CC":
                    CommandDef cc = new CC();
                    cc.setData(df.getDataBeforeMod());
                    cc.execute();
                    collectedData.add(cc);
                    break;
                case "REVERSE":
                    CommandDef reverse = new Reverse();
                    reverse.setData(df.getDataBeforeMod());
                    reverse.execute();
                    collectedData.add(reverse);
                    break;
                case "ORDER":
                    CommandDef order = new Order();
                    order.setData(df.getDataBeforeMod());
                    order.execute();
                    collectedData.add(order);
                    break;
                default:
                    System.out.println("Such instruction does not exist");
            }

        }

        return collectedData;

    }
}
