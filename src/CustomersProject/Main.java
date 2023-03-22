package CustomersProject;

import java.util.Scanner;
public class Main {
    private int decision;

    public static String[][] addList(String nome, String endereco, String[][] arr) {

        if (arr[0][0] == null) {
            arr[0][0] = nome;
            arr[0][1] = endereco;
            return arr;
        } else {
            String[][] newArr = new String[arr.length + 1][2];
            System.out.println(arr.length + " " + newArr.length);

            for(int i = 0; i < arr.length; i++) {
                for(int x = 0; x < 2; x++) {
                    newArr[i][x] = arr[i][x];
                };
            }

            newArr[arr.length][0] = nome;
            newArr[arr.length][1] = endereco;

            arr = newArr;


            return arr;
        }
    };

    public static void main(String[] args) {
        Scanner     scanner     = new Scanner(System.in);
        Cliente     cliente     = new Cliente();
        Funcionario funcionario = new Funcionario();
        Produto     produto     = new Produto();
        Venda       venda       = new Venda();
        ItemVenda   itemVenda   = new ItemVenda();

        Integer choice;
        String nomeNew, enderecoNew, codigo;
        String[][] cadastros = new String[1][2];

        System.out.println("\nBem vindo ao sistema logístico.\nO quê deseja fazer?");
        System.out.println("\n1 - Registrar CustomersProject.Cliente" +
                           "\n2 - Registrar CustomersProject.Funcionario" +
                           "\n3 - Registrar CustomersProject.Produto" +
                           "\n4 - Checar Produtos Disponíveis" +
                           "\n5 - Relatório de Vendas" +
                           "\n6 - Sair");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Digite o Nome do CustomersProject.Cliente");
                nomeNew = scanner.next();
                System.out.println("Digite o Endereço do CustomersProject.Cliente");
                scanner.nextLine();
                enderecoNew = scanner.nextLine();
                System.out.println("Digite o Código de Registro do CustomersProject.Cliente");
                codigo = scanner.nextLine();
                cadastros = addList(nomeNew, enderecoNew, cadastros);
                break;
        }


        System.out.println(cadastros[0][0]);
        System.out.println(cadastros[0][1]);



    }

}