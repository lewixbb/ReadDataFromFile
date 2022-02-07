package OutputData;
import InputData.ReadFromFile;

import java.util.List;

public class PrintData<T>{

    public void printListToConsole(List S){

        ReadFromFile rff = new ReadFromFile();
        
        System.out.println("Printout of the program on the basis of the data contained in the " + rff.getFileName() + " file.");

        for (Object t: S) {

            System.out.println(t);

        }

    }

}
