package atleta;

public class CorredorEstadoDescansando implements CorredorEstado {
    private CorredorEstadoDescansando() {};
    private static CorredorEstadoDescansando instance = new CorredorEstadoDescansando();
    public static CorredorEstadoDescansando getInstance(){
        return instance;
    }
    public String getNomeEstado(){
        return "Descansando";
    }
}
