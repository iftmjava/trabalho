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
    private static int id;
    @DatabaseField(foreign = true)
    private Usuarios avaliador;
    @DatabaseField
    private String comentario;
    @DatabaseField
    private boolean aprovado = false;
    @DatabaseField(foreign = true)
    public Evento event;
    @DatabaseField
    private int linguagem;
    @DatabaseField
    private int qualidade;
    @DatabaseField
    private int organizacao;
    @DatabaseField
    private int numAvaliadores;

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

    public Evento getEvent() {
        return event;
    }

    public void setEvent(Evento event) {
        this.event = event;
    }

    public int getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(int linguagem) {
        this.linguagem = linguagem;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(int organizacao) {
        this.organizacao = organizacao;
    }

    public int getNumAvaliadores() {
        return numAvaliadores;
    }

    public void setNumAvaliadores(int numAvaliadores) {
        this.numAvaliadores = numAvaliadores;
    }

    /**
     *
     */
   // public static final Usuarios tartge = new Usuarios();
    //Confere = avaliador;

    

}
