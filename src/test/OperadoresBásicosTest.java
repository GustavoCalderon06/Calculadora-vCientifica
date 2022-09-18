import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperadoresBásicosTest {

    @Test
    public void suma() {
        OperadoresBásicos operadores= new OperadoresBásicos();
        //assertEquals(valorEsperado, valorReal, error)
        assertEquals(2,operadores.Suma(1,1));
    }

    @Test
    public void resta() {

    }

    @Test
    void multiplicacion() {
    }

    @Test
    void division() {
    }

    @Test
    void mayor() {
    }

    @Test
    void menor() {
    }

    @Test
    void potencia() {
    }

    @Test
    void porcentajeX1() {
    }

    @Test
    void porcentajeX2() {
    }
}