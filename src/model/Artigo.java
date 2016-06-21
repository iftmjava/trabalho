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
    @DatabaseField
    private boolean aceito = false; //valida artigo
    @DatabaseField
    private int idUser;
    @DatabaseField(id = true)
    private static int idArtigo = 0;
    @DatabaseField
    private Usuarios avaliador;
    @DatabaseField
    private double avaliacaoLin = 0;
    @DatabaseField
    private double avaliacaoQual = 0;
    @DatabaseField
    private double avaliacaoOrg = 0;
    @DatabaseField
    private int numAvaliadores = 0;
    @DatabaseField
    private String comentario = "";
    @DatabaseField
    private boolean validacao = false;
    
    
    public Artigo() {
        idArtigo ++;
    }
    //Metodos do Artigo
    public boolean isValidacao() {
        return validacao;
    }

    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario += comentario;
    }

    public double getAvaliacaoLin() {
        return avaliacaoLin;
    }
    
     public Usuarios getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Usuarios avaliador) {
        this.avaliador = avaliador;
    }

    public void setAvaliacaoLin(double avaliacaoLin) {
        this.avaliacaoLin += avaliacaoLin;
    }

    public double getAvaliacaoQual() {
        return avaliacaoQual;
    }

    public void setAvaliacaoQual(double avaliacaoQual) {
        this.avaliacaoQual += avaliacaoQual;
    }

    public double getAvaliacaoOrg() {
        return avaliacaoOrg;
    }

    public void setAvaliacaoOrg(double avaliacaoOrg) {
        this.avaliacaoOrg += avaliacaoOrg;
    }

    public int getNumAvaliadores() {
        return numAvaliadores;
    }

    public void setNumAvaliadores(int numAvaliadores) {
        this.numAvaliadores += numAvaliadores;
    }

   
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdArtigo(int idArtigo) {
        this.idArtigo = idArtigo;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getIdArtigo() {
        return idArtigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuarios getAutor() {
        return autor;
    }

    public void setAutor(Usuarios autores) {
        this.autor = autores;
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

    public boolean getAceito() {
        return aceito;
    }

    public void setAceito(boolean aceito) {
        this.aceito = aceito;
    }
}
