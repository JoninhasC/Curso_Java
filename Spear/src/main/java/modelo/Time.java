/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author jonin
 */
public class Time extends EstatisticasTimes{
    private String nome;
    private String organizacao;
    private List<Jogador> jogadores;
    private String logo;
    
    // Construtor

    public Time(String nome, String organizacao, List<Jogador> jogadores, String logo, Integer idEstaticasTime, int totalPartidas, int totalVitorias, int totalDerrotas, int totalEmpates, int totalPontosMarcados, int totalPontosSofridos, double mediaPontosMarcados, double mediaPontosSofridos, double porcentagemVitorias, double porcentagemDerrotas, double porcentagemEmpates) {
        super(idEstaticasTime, totalPartidas, totalVitorias, totalDerrotas, totalEmpates, totalPontosMarcados, totalPontosSofridos, mediaPontosMarcados, mediaPontosSofridos, porcentagemVitorias, porcentagemDerrotas, porcentagemEmpates);
        this.nome = nome;
        this.organizacao = organizacao;
        this.jogadores = jogadores;
        this.logo = logo;
    }
   
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getOrganizacao() {
        return organizacao;
    }
    
    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }
    
    public List<Jogador> getJogadores() {
        return jogadores;
    }
    
    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    
    public String getLogo() {
        return logo;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }
}
