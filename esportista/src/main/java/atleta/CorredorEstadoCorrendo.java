package atleta;

public class CorredorEstadoCorrendo implements CorredorEstado {
    private CorredorEstadoCorrendo() {};
    private static CorredorEstadoCorrendo instance = new CorredorEstadoCorrendo();
    public static CorredorEstadoCorrendo getInstance(){
        return instance;
    }
    public String getNomeEstado(){
        return "Correndo";
    }
}
