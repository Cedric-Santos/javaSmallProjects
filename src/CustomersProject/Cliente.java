package CustomersProject;

public class Cliente {

    private int codigo;

    private String nome, endereco;

    private String[][] cadastros = new String[1][1];



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String[][] addList(String nome, String endereco, String[][] arr) {
        String[][] newArr = new String[arr.length + 1][arr.length + 1];
        return arr;
    };

}
