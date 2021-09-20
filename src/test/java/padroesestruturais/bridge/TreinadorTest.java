package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.basic.BasicGraphicsUtils;

import static org.junit.jupiter.api.Assertions.*;

class TreinadorTest {

    @Test
    void deveRetornarSalarioAdministrativoComEnsinoMedio() {
        Administrativo administrativo = new Administrativo(1000.0f);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

}