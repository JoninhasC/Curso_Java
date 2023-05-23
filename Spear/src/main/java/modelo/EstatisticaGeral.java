/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author jonin
 */
public class EstatisticaGeral extends EstatisticaPartida{
    private Integer idEstatisticaGeral;
    private double mediaKill;
    private double mediaMorte;
    private double mediaAssists;
    private int totalKill;
    private int totalMorte;
    private int totalAssists;
    private int totalPartidaJogador;
    EstatisticaPartida estaPart = new EstatisticaPartida();


    public EstatisticaGeral(Integer idEstatisticaGeral, double mediaKill, double mediaMorte, double mediaAssists, int totalKill, int totalMorte, int totalAssists, int totalPartidaJogador, Integer idEstaticaparida, int numeroKill, int numeroMortes, int numeroAssists, double KdRatio) {
        super(idEstaticaparida, numeroKill, numeroMortes, numeroAssists, KdRatio);
        this.idEstatisticaGeral = idEstatisticaGeral;
        this.mediaKill = (mediaKill+estaPart.getNumeroKill())/this.totalPartidaJogador;
        this.mediaMorte = (mediaMorte+estaPart.getNumeroMortes())/this.totalPartidaJogador;
        this.mediaAssists = (mediaAssists+estaPart.getNumeroAssists())/this.totalPartidaJogador;
        this.totalKill = totalKill;
        this.totalMorte = totalMorte;
        this.totalAssists = totalAssists;
        this.totalPartidaJogador = totalPartidaJogador;
    }

    public Integer getIdEstatisticaGeral() {
        return idEstatisticaGeral;
    }

    public void setIdEstatisticaGeral(Integer idEstatisticaGeral) {
        this.idEstatisticaGeral = idEstatisticaGeral;
    }

    public double getMediaKill() {
        return mediaKill;
    }

    public void setMediaKill(double mediaKill) {
        this.mediaKill = mediaKill;
    }

    public double getMediaMorte() {
        return mediaMorte;
    }

    public void setMediaMorte(double mediaMorte) {
        this.mediaMorte = mediaMorte;
    }

    public double getMediaAssists() {
        return mediaAssists;
    }

    public void setMediaAssists(double mediaAssists) {
        this.mediaAssists = mediaAssists;
    }

    public int getTotalKill() {
        return totalKill;
    }

    public void setTotalKill(int totalKill) {
        this.totalKill = totalKill;
    }

    public int getTotalMorte() {
        return totalMorte;
    }

    public void setTotalMorte(int totalMorte) {
        this.totalMorte = totalMorte;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public void setTotalAssists(int totalAssists) {
        this.totalAssists = totalAssists;
    }

    public int getTotalPartidaJogador() {
        return totalPartidaJogador;
    }

    public void setTotalPartidaJogador(int totalPartidaJogador) {
        this.totalPartidaJogador = totalPartidaJogador;
    }

    @Override
    public String toString() {
        return "EstatisticaGeral{" + "idEstatisticaGeral=" + idEstatisticaGeral + ", mediaKill=" + mediaKill + ", mediaMorte=" + mediaMorte + ", mediaAssists=" + mediaAssists + ", totalKill=" + totalKill + ", totalMorte=" + totalMorte + ", totalAssists=" + totalAssists + ", totalPartidaJogador=" + totalPartidaJogador + '}';
    }
    
    
}
