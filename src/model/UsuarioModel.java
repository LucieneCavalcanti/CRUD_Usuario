package model;

public class UsuarioModel {
    private int id;
    private String nome;
    private String email;
    private int tipo;
    public UsuarioModel() {
        id = 0;
        nome = new String();
        email = new String();
        tipo = 0;
    }
    public UsuarioModel(int id, String nome, String email, int tipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
