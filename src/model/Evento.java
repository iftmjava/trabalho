package model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.time.LocalDate;

@DatabaseTable(tableName = "eventos")
public class Evento {
    @DatabaseField(id = true)
    private int id;
    @DatabaseField
    private String nome;
    @DatabaseField
    private LocalDate data_criacao;
    @DatabaseField
    private LocalDate data_limite;
    @DatabaseField
    private int edicao;
    @DatabaseField
    private String area;
    @DatabaseField
    private int nArtigosAceitos;
    @DatabaseField
    private int limiteArtigos;

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

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
    }

    public LocalDate getData_limite() {
        return data_limite;
    }

    public void setData_limite(LocalDate data_limite) {
        this.data_limite = data_limite;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getnArtigosAceitos() {
        return nArtigosAceitos;
    }

    public void setnArtigosAceitos(int nArtigosAceitos) {
        this.nArtigosAceitos = nArtigosAceitos;
    }

    public int getLimiteArtigos() {
        return limiteArtigos;
    }

    public void setLimiteArtigos(int limiteArtigos) {
        this.limiteArtigos = limiteArtigos;
    }

}
