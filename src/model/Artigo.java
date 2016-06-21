package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "artigos")
public class Artigo {
    @DatabaseField
    private String nome;
    @DatabaseField(foreign = true)
    public Usuarios autor;
    @DatabaseField
    private String area;
    @DatabaseField
    private String Resumo;
    @DatabaseField(id = true)
    private static int id = 0;
    @DatabaseField
    private Usuarios avaliador;
    @DatabaseField
    private String comentario;
    @DatabaseField
    private boolean aprovado = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuarios getAutor() {
        return autor;
    }

    public void setAutor(Usuarios autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getResumo() {
        return Resumo;
    }

    public void setResumo(String Resumo) {
        this.Resumo = Resumo;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Artigo.id = id;
    }

    public Usuarios getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Usuarios avaliador) {
        this.avaliador = avaliador;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
}
