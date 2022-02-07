package InputData;

public class DataFormat {

    private String algorithmName;
    private String dataBeforeMod;

    public DataFormat(String algorithmName, String dataBeforeMod) {
        this.algorithmName = algorithmName;
        this.dataBeforeMod = dataBeforeMod;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public String getDataBeforeMod() {
        return dataBeforeMod;
    }

    public void setDataBeforeMod(String dataBeforeMod) {
        this.dataBeforeMod = dataBeforeMod;
    }
}
