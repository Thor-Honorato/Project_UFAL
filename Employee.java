import java.util.Random;
import java.util.List;

/* ANALISANDO AS CLASSES DOS EMPREGADOS */

public class Employee {

    public String name;
    public String adress;
    public String salary;
    public Boolean syndicate;
    public List<TimeCard> timeCards;
    public String paymentMethod;
    public int code;

    public Employee(String name, String adress, String salary, Boolean syndicate, List<TimeCard> timeCards,
            String paymentMethod) {
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.syndicate = syndicate;
        this.timeCards = (List<TimeCard>) timeCards;
        this.paymentMethod = paymentMethod;
        this.code = (new Random()).nextInt(9999);
    }

    public Employee(String name, String adress, String salary, Boolean syndicate, String paymentMethod) {
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.syndicate = syndicate;
        this.paymentMethod = paymentMethod;
        this.code = (new Random()).nextInt(9999);
    }

    public String PrintEmployeeInfo() {
        return "Nome: " + this.name +
                "\nCódigo: " + this.code +
                "\nEndereco: " + this.adress +
                "\nPertence ao Sindicato: " + this.syndicate +
                "\nCartão de Ponto: " + this.timeCards +
                "\nTipo de Salário: " + this.salary +
                "\nMétodo de Pagamento: " + this.paymentMethod;
    }

    public String printEmployees() {
        return "\nNome: " + this.name;
    }

}
