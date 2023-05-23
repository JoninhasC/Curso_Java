/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jonin
 */
public class EstatisticasTimes {
    private Integer idEstaticasTime;
    private int totalPartidas;
    private int totalVitorias;
    private int totalDerrotas;
    private int totalEmpates;
    private int totalPontosMarcados;
    private int totalPontosSofridos;
    private double mediaPontosMarcados;
    private double mediaPontosSofridos;
    private double porcentagemVitorias;
    private double porcentagemDerrotas;
    private double porcentagemEmpates;

    @Override
    public String toString() {
        return "EstatisticasTimes{" + "idEstaticasTime=" + idEstaticasTime + ", totalPartidas=" + totalPartidas + ", totalVitorias=" + totalVitorias + ", totalDerrotas=" + totalDerrotas + ", totalEmpates=" + totalEmpates + ", totalPontosMarcados=" + totalPontosMarcados + ", totalPontosSofridos=" + totalPontosSofridos + ", mediaPontosMarcados=" + mediaPontosMarcados + ", mediaPontosSofridos=" + mediaPontosSofridos + ", porcentagemVitorias=" + porcentagemVitorias + ", porcentagemDerrotas=" + porcentagemDerrotas + ", porcentagemEmpates=" + porcentagemEmpates + '}';
    }

    public Integer getIdEstaticasTime() {
        return idEstaticasTime;
    }

    public void setIdEstaticasTime(Integer idEstaticasTime) {
        this.idEstaticasTime = idEstaticasTime;
    }

    public int getTotalPartidas() {
        return totalPartidas;
    }

    public void setTotalPartidas(int totalPartidas) {
        this.totalPartidas = totalPartidas;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        this.totalDerrotas = totalDerrotas;
    }

    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int totalEmpates) {
        this.totalEmpates = totalEmpates;
    }

    public int getTotalPontosMarcados() {
        return totalPontosMarcados;
    }

    public void setTotalPontosMarcados(int totalPontosMarcados) {
        this.totalPontosMarcados = totalPontosMarcados;
    }

    public int getTotalPontosSofridos() {
        return totalPontosSofridos;
    }

    public void setTotalPontosSofridos(int totalPontosSofridos) {
        this.totalPontosSofridos = totalPontosSofridos;
    }

    public double getMediaPontosMarcados() {
        return mediaPontosMarcados;
    }

    public void setMediaPontosMarcados(double mediaPontosMarcados) {
        this.mediaPontosMarcados = mediaPontosMarcados;
    }

    public double getMediaPontosSofridos() {
        return mediaPontosSofridos;
    }

    public void setMediaPontosSofridos(double mediaPontosSofridos) {
        this.mediaPontosSofridos = mediaPontosSofridos;
    }

    public double getPorcentagemVitorias() {
        return porcentagemVitorias;
    }

    public void setPorcentagemVitorias(double porcentagemVitorias) {
        this.porcentagemVitorias = porcentagemVitorias;
    }

    public double getPorcentagemDerrotas() {
        return porcentagemDerrotas;
    }

    public void setPorcentagemDerrotas(double porcentagemDerrotas) {
        this.porcentagemDerrotas = porcentagemDerrotas;
    }

    public double getPorcentagemEmpates() {
        return porcentagemEmpates;
    }

    public void setPorcentagemEmpates(double porcentagemEmpates) {
        this.porcentagemEmpates = porcentagemEmpates;
    }

    public EstatisticasTimes(Integer idEstaticasTime, int totalPartidas, int totalVitorias, int totalDerrotas, int totalEmpates, int totalPontosMarcados, int totalPontosSofridos, double mediaPontosMarcados, double mediaPontosSofridos, double porcentagemVitorias, double porcentagemDerrotas, double porcentagemEmpates) {
        this.idEstaticasTime = idEstaticasTime;
        this.totalPartidas = totalPartidas;
        this.totalVitorias = totalVitorias;
        this.totalDerrotas = totalDerrotas;
        this.totalEmpates = totalEmpates;
        this.totalPontosMarcados = totalPontosMarcados;
        this.totalPontosSofridos = totalPontosSofridos;
        this.mediaPontosMarcados = mediaPontosMarcados;
        this.mediaPontosSofridos = mediaPontosSofridos;
        this.porcentagemVitorias = porcentagemVitorias;
        this.porcentagemDerrotas = porcentagemDerrotas;
        this.porcentagemEmpates = porcentagemEmpates;
    }
}
