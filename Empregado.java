
/* EMPREGADOS - TESTE */

public class Empregado {

    private int Code;
    private String Name;
    private String Adress;
    private String Salary;

    public Empregado(int Code, String Name, String Adress, String Salary) {
        this.Code = Code;
        this.Name = Name;
        this.Adress = Adress;
        this.Salary = Salary;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getSalary() {
        return Salary;
    }

    public void setType(String Salary) {
        this.Salary = Salary;
    }

    public String toString() {
        return "Nome: " + Name +
                "Tipo de Salario: " + Salary +
                "Codigo: " + Code +
                "Endereco: " + Adress;
    }

}