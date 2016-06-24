package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "usuarios")
public class Usuarios {
    
    public static final String USUARIO_CAMPO = "login";
    
    @DatabaseField(generatedId  = true,allowGeneratedIdInsert=true)
    private int id;
    @DatabaseField(columnName = USUARIO_CAMPO)
    private String login;
    @DatabaseField
    private String senha;
    @DatabaseField
    private String nome;
    @DatabaseField
    private String email;
    @DatabaseField
    private String tipo;

    //Metodos do Usuarios
    public static final String Confere = "login";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

}
