package control;

import java.time.LocalDate;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "eventos")
public class Evento {
    @DatabaseField
    private String nome;
    @DatabaseField
    private LocalDate data;
    @DatabaseField
    private int edicao;
    @DatabaseField
    private String area;
    @DatabaseField
    private int nArtigosAceitos;
    @DatabaseField
    private int periodoEvento;
    @DatabaseField
    private LocalDate dataLimite;
    @DatabaseField(id = true)
    private int id = 0;
    @DatabaseField
    private int limiteArtigos;
    @DatabaseField
    private boolean eventoCriado = false;

    public boolean isEventoCriado() {
        return eventoCriado;
    }

    //Metodos do Evento
    public String getNome() {
        return nome;
    }

    public boolean getEventoCriado() {
        return eventoCriado;
    }

    public void setEventoCriado(boolean eventoCriado) {
        this.eventoCriado = eventoCriado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public int getPeriodoEvento() {
        return periodoEvento;
    }

    public void setPeriodoEvento(int periodoEvento) {
        this.periodoEvento = periodoEvento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public int getLimiteArtigos() {
        return limiteArtigos;
    }

    public void setLimiteArtigos(int limiteArtigos) {
        this.limiteArtigos = limiteArtigos;
    }

}
