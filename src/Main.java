import java.util.Scanner;
public class Main {
    private int decision;
    public static void main(String[] args) {
        Scanner     scanner     = new Scanner(System.in);
        Cliente     cliente     = new Cliente();
        Funcionario funcionario = new Funcionario();
        Produto     produto     = new Produto();
        Venda       venda       = new Venda();
        ItemVenda   itemVenda   = new ItemVenda();



        System.out.println("\nBem vindo ao sistema logístico.\nO quê deseja fazer?");
        System.out.println("\n1 - Registrar Cliente" +
                           "\n2 - Registrar Funcionario" +
                           "\n3 - Registrar Produto" +
                           "\n4 - Checar Produtos Disponíveis" +
                           "\n5 - Relatório de Vendas" +
                           "\n6 - Sair");

    }
}