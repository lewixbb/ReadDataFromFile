package ProcessAlgorithm;

abstract public class CommandDef<T,G> {

    T data;
    G result;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public G getResult() {
        return result;
    }

    public void setResult(G result) {
        this.result = result;
    }

    abstract public void execute ();

    @Override
    public String toString() {
        return "opperation = " + getClass().getSimpleName() + " , value before mod = " + data
                + " , value after mod = " + result;
    }
}

