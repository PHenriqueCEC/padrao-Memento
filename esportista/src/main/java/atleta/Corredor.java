package atleta;
import java.util.ArrayList;
import java.util.List;

public class Corredor {
    private CorredorEstado estado;
    private List<CorredorEstado> memento = new ArrayList<>();

    public CorredorEstado getEstado() {
        return this.estado;
    }

    public void setEstado(CorredorEstado estado) {
        this.estado = estado;
        this.memento.add((this.estado));
    }

    public void restauraEstado (int indice) {
        if(indice < 0 || indice > this.memento.size() - 1){
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<CorredorEstado> getEstados (){
        return this.memento;
    }
}
