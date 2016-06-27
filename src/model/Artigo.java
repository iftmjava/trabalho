package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "artigo")
public class Artigo {

    @DatabaseField
    private String nome;
    @DatabaseField(foreign = true)
    public Usuarios autor;
    @DatabaseField
    private String area;
    @DatabaseField
    private String Resumo;
    @DatabaseField(generatedId = true, allowGeneratedIdInsert = true)
    private int id;
    @DatabaseField(foreign = true)
    private Usuarios avaliador;
    @DatabaseField
    private String comentario = "";
    @DatabaseField
    private String aprovado;
    @DatabaseField(foreign = true)
    public Evento event;
    @DatabaseField
    private float linguagem;
    @DatabaseField
    private float qualidade;
    @DatabaseField
    private float organizacao;
    @DatabaseField
    private int numAvaliadores;

    // public static final Usuarios tartge = new Usuarios();
    //Confere = avaliador;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.comentario = this.comentario + comentario;
    }

    public String getAprovado() {
        return aprovado;
    }

    public void setAprovado(String aprovado) {
        this.aprovado = aprovado;
    }

    public Evento getEvent() {
        return event;
    }

    public void setEvent(Evento event) {
        this.event = event;
    }

    public float getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(float linguagem) {
        this.linguagem = linguagem;
    }

    public float getQualidade() {
        return qualidade;
    }

    public void setQualidade(float qualidade) {
        this.qualidade = qualidade;
    }

    public float getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(float organizacao) {
        this.organizacao = organizacao;
    }

    public int getNumAvaliadores() {
        return numAvaliadores;
    }

    public void setNumAvaliadores(int numAvaliadores) {
        this.numAvaliadores = numAvaliadores;
    }

}
