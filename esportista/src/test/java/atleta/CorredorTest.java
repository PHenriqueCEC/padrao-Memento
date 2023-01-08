package atleta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorredorTest {

    @Test
    void deveArmazenarEstados() {
        Corredor corredor = new Corredor();
        corredor.setEstado(CorredorEstadoAquecendo.getInstance());
        corredor.setEstado(CorredorEstadoDescansando.getInstance());
        assertEquals(2, corredor.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Corredor corredor = new Corredor();
        corredor.setEstado(CorredorEstadoDescansando.getInstance());
        corredor.setEstado(CorredorEstadoAquecendo.getInstance());
        corredor.restauraEstado(0);
        assertEquals(CorredorEstadoDescansando.getInstance(), corredor.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Corredor corredor = new Corredor();
        corredor.setEstado(CorredorEstadoDescansando.getInstance());
        corredor.setEstado(CorredorEstadoAquecendo.getInstance());
        corredor.setEstado(CorredorEstadoDescansando.getInstance());
        corredor.setEstado(CorredorEstadoCorrendo.getInstance());
        corredor.restauraEstado(2);
        assertEquals(CorredorEstadoDescansando.getInstance(), corredor.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Corredor aprendiz = new Corredor();
            aprendiz.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }






}
