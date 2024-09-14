package data;

public class TesteConexao {
public static void main(String[] args) {
    try {
        Conexao c = new Conexao();
        System.out.println("Deu certo");
    } catch (Exception e) {
        System.out.println("Erro:"
        +e.getMessage());
    }
}
}
