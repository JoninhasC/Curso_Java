/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jonin
 */
public class Formato {
    private Integer idFormato;
    private String nome;
    private String descricao;
    private int numMinPartipante;
    private int numMaxpatipante;
    private int numMinRodadas;
    private String criterioPont;
    private String criterioDesempate;

    public Formato(Integer idFormato, String nome, String descricao, int numMinPartipante, int numMaxpatipante, int numMinRodadas, String criterioPont, String criterioDesempate) {
        this.idFormato = idFormato;
        this.nome = nome;
        this.descricao = descricao;
        this.numMinPartipante = numMinPartipante;
        this.numMaxpatipante = numMaxpatipante;
        this.numMinRodadas = numMinRodadas;
        this.criterioPont = criterioPont;
        this.criterioDesempate = criterioDesempate;
    }

    public Integer getIdFormato() {
        return idFormato;
    }

    public void setIdFormato(Integer idFormato) {
        this.idFormato = idFormato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumMinPartipante() {
        return numMinPartipante;
    }

    public void setNumMinPartipante(int numMinPartipante) {
        this.numMinPartipante = numMinPartipante;
    }

    public int getNumMaxpatipante() {
        return numMaxpatipante;
    }

    public void setNumMaxpatipante(int numMaxpatipante) {
        this.numMaxpatipante = numMaxpatipante;
    }

    public int getNumMinRodadas() {
        return numMinRodadas;
    }

    public void setNumMinRodadas(int numMinRodadas) {
        this.numMinRodadas = numMinRodadas;
    }

    public String getCriterioPont() {
        return criterioPont;
    }

    public void setCriterioPont(String criterioPont) {
        this.criterioPont = criterioPont;
    }

    public String getCriterioDesempate() {
        return criterioDesempate;
    }

    public void setCriterioDesempate(String criterioDesempate) {
        this.criterioDesempate = criterioDesempate;
    }

    @Override
    public String toString() {
        return "Formato{" + "idFormato=" + idFormato + ", nome=" + nome + ", descricao=" + descricao + ", numMinPartipante=" + numMinPartipante + ", numMaxpatipante=" + numMaxpatipante + ", numMinRodadas=" + numMinRodadas + ", criterioPont=" + criterioPont + ", criterioDesempate=" + criterioDesempate + '}';
    }
    
}