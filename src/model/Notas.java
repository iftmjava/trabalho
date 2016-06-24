
package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "notas")
public class Notas {
    
    @DatabaseField(generatedId  = true,allowGeneratedIdInsert=true)
    private int id;
    @DatabaseField
    private int linguagem;
    @DatabaseField
    private int qualidade;
    @DatabaseField
    private int organizacao;
    @DatabaseField(foreign = true)
    private Artigo artigo;

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

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
    
    
}
