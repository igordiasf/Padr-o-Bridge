package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativoTest {

    @Test
    void deveRetornarSalarioAdministrativoComEnsinoMedio() {
        Administrativo administrativo = new Administrativo(1000.0f);
        assertEquals(1000.0f, administrativo.calcularSalario(), 0.01f);
    }

}