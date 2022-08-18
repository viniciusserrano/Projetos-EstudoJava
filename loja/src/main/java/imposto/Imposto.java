package imposto;

import orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    protected  abstract BigDecimal realizarCalculo(Orcamento orcamento);
   public abstract BigDecimal calcular(Orcamento orcamento) {


   }

}
