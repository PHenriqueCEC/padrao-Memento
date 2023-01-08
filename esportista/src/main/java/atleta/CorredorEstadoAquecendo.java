package atleta;

public class CorredorEstadoAquecendo implements CorredorEstado {
    private CorredorEstadoAquecendo() {};
    private static CorredorEstadoAquecendo instance = new CorredorEstadoAquecendo();
    public static CorredorEstadoAquecendo getInstance(){
        return instance;
    }
    public String getNomeEstado(){
        return "Aquecendo";
    }
}
