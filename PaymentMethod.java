
/* MÉTODO DE PAGAMENTO */

public class PaymentMethod {

    public String paymentMethod;
    public int dayOfMonth;

    /**
     * mensal1
     * mensal2
     * mensal$
     * semanal1
     * semanal2
     * bisemanal
     */

    public PaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}

/**
 * • "mensal 1": dia 1 de todo mês
 * • "mensal 7": dia 7 de todo mês
 * • "mensal $": último dia útil de todo mês
 * • "semanal 1 segunda": toda semana às segundas-feiras
 * • "semanal 1 sexta": toda semana às sextas-feiras
 * • “semanal 2 segunda": a cada 2 semanas às segundas-feiras
 */