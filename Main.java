import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();
        List<TimeCard> timeCards = new ArrayList<>();

        /* Lista de Empregados Iniciais */

        TimeCard timeCard = new TimeCard("25-05-2022", 8);
        timeCards.add(timeCard);
        Employee employee1 = new Employee("Wesley Honorato", "Aeroporto", "Assalariado", true, timeCards,
                "Cheque pelos Correios");
        employees.add(employee1);
        Employee employee2 = new Employee("Thor Honorato", "Asgard", "Horista", false, timeCards, "Cheque em Mãos");
        employees.add(employee2);
        Employee employee3 = new Employee("Neto Castro", "Rua da Lama", "Comissionado", true, timeCards,
                "Depósito Bancário");
        employees.add(employee3);

        int Option;

        do {
            /** Menu do Programa */

            System.out.println("\n> O que voce deseja fazer?\n");
            System.out.println("[1] - Adicionar um Empregado");
            System.out.println("[2] - Remover um Empregado");
            System.out.println("[3] - Lancar um Cartão de Ponto");
            System.out.println("[4] - Lançar um Resultado de Venda");
            System.out.println("[5] - Lancar uma Taxa de Servico");
            System.out.println("[6] - Alterar Detalhes de um Empregado");
            System.out.println("[7] - Rodar Folha de Pagamento de Hoje");
            System.out.println("[8] - Undo/Redo (Desfeito/Refeito)");
            System.out.println("[9] - Agenda de Pagamento");
            System.out.println("[0] - Fechar Programa");

            Option = sc.nextInt();
            sc.nextLine();

            switch (Option) {

                case 0:

                    System.out.println("\nFechando Programa...\n");
                    break;

                case 1:

                    System.out.println("Adicionando Empregado\n\nNome: ");
                    String name = sc.nextLine();
                    System.out.println("\nEndereco: ");
                    String adress = sc.nextLine();
                    System.out.println("\nTipo de Salário (Horista, Assalariado ou Comissionado): ");
                    String salary = sc.nextLine();
                    System.out.println("\nFuncionário Pertence ao Sindicato ? [yes/no] ");
                    Boolean syndicate = (sc.next() == "yes" ? true : false);
                    System.out.println(
                            "\nMétodo de Pagamento (Cheque pelos Correios, Cheque em mãos, Depósito Bancário) ?");
                    String paymentMethod = sc.nextLine();

                    Employee emp = new Employee(name, adress, salary, syndicate, paymentMethod);

                    employees.add(emp);

                    break;

                case 2:
                    System.out.println("Lista de employees:\n");
                    for (Employee namesList : employees) {
                        System.out.println(namesList.printEmployees());
                    }

                    System.out.println("\nQual Funcionário Deseja Remover ?\n");

                    System.out.println("Nome: ");
                    String remover = sc.nextLine();

                    for (int i = 0; i < employees.size(); i++) {

                        if (employees.get(i).name.equals(remover)) {

                            employees.remove(i);

                            System.out.println("\nEmpregado Removido.");

                            break;
                        }
                    }

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    System.out.println("Lista de employees:");

                    for (Employee namesList : employees) {
                        System.out.println(namesList.printEmployees());
                    }

                    System.out.println("\nQual Funcionário Deseja Fazer uma Alteração ?\n");

                    System.out.println("Nome: ");
                    String nomeEmpregado = sc.nextLine();

                    for (int i = 0; i < employees.size(); i++) {

                        if (employees.get(i).name.equals(nomeEmpregado)) {
                            System.out.println("\nCódigo: " + employees.get(i).code +
                                    "\n[1] - Nome do Empregado: " + employees.get(i).name +
                                    "\n[2] - Endereço: " + employees.get(i).adress +
                                    "\n[3] - Tipo de Salário: " + employees.get(i).salary +
                                    "\n[4] - Metodo de Pagamento: " + employees.get(i).paymentMethod +
                                    "\n[5] - Identificação do Sindicato: " + employees.get(i).syndicate +
                                    "\n[0] - Voltar");

                            System.out.println("\nQual Opção deseja alterar?\n");

                            int Option6 = sc.nextInt();
                            sc.nextLine();

                            switch (Option6) {
                                case 1:
                                    System.out.println("Novo Nome: ");
                                    employees.get(i).name = sc.nextLine();

                                    System.out.println("\nNovo Nome do Empregado: " + employees.get(i).name
                                            + "\nAtualizado");

                                    break;

                                case 2:
                                    System.out.println("Novo Endereço: ");
                                    employees.get(i).adress = sc.nextLine();

                                    System.out.println("Novo Endereço do Empregado: " + employees.get(i).adress
                                            + "\nAtualizado");

                                    break;

                                case 3:
                                    System.out.println("Tipos de Salários: 'Horista', 'Assalariado' e 'Comissionado'.");
                                    System.out.println("Novo Método de Salário: ");
                                    employees.get(i).salary = sc.nextLine();

                                    System.out.println("\nO Salário de " + employees.get(i).name + " é: " +
                                            employees.get(i).salary);

                                    break;

                                case 4:
                                    System.out.println("Novo Método de Pagamento: ");
                                    employees.get(i).paymentMethod = sc.nextLine();

                                    System.out.println(
                                            "Método de Pagamento Atualizado: " + employees.get(i).paymentMethod);

                                    break;

                                case 5:
                                    System.out.println(
                                            "Atualização Sindical,\nFuncionário Pertence ao Sindicato? [yes/no]: ");
                                    employees.get(i).syndicate = (sc.next() == "yes" ? true : false);

                                    System.out.println("Atualizado.\n");

                                    break;
                            }
                        }
                    }

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                default:

                    System.out.println("Opcao Invalida.");
                    break;
            }

        } while (Option != 0);

        sc.close();
    }

}