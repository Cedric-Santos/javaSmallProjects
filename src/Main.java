import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Insert new address");
        cliente.setEndereco(scanner.next());
        System.out.println(cliente.getEndereco());
    }
}