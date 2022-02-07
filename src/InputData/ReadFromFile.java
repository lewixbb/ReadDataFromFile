package InputData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    List<String> ordersList = List.of("SUM", "CC", "REVERSE", "ORDER");

    ArrayList<DataFormat> dataInputList = new ArrayList<>();
    private String fileName = "data2.txt";

    public ArrayList<DataFormat> read() {

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
        ) {
            String readedline = null;
            while ((readedline = bufferedReader.readLine()) != null) {

                if (ordersList.contains(readedline)) {

                    DataFormat dF = new DataFormat(readedline, bufferedReader.readLine());
                    dataInputList.add(dF);
                }
            }

        } catch (IOException e) {
            System.err.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }

        return dataInputList;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}