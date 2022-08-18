package Service;

import modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class BonusServiceTest {

    @Test
    void calcularBonus() {
        BonusService service = new BonusService();
//        assertThrows(IllegalArgumentException.class,() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));

        try {
            service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
            fail("Nao deu a Exception");
        }catch (Exception e){
            assertEquals("Funcionario com Salario Maior do que dez mil reais nao pode receber bonus", e.getMessage());
        }



    }

    void DeveriacalcularBonusESerDezPorcentDoSlario() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250"), bonus);
    }

    void bonusDeveriaSerDezPorCentoParaSalarioDeDezMilReais() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}