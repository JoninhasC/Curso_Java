/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jonin
 */
public class EstatisticaPartida {
    private Integer idEstaticaparida;
    private int numeroKill;
    private int numeroMortes;
    private int numeroAssists;
    private  double KdRatio;
    
    public EstatisticaPartida(Integer idEstaticaparida, int numeroKill, int numeroMortes, int numeroAssists, double KdRatio) {
        this.idEstaticaparida = idEstaticaparida;
        this.numeroKill = numeroKill;
        this.numeroMortes = numeroMortes;
        this.numeroAssists = numeroAssists;
        this.KdRatio = KdRatio;
    }

    EstatisticaPartida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    @Override
    public String toString() {
        return "EstatisticaPartida{" + "idEstaticaparida=" + idEstaticaparida + ", numeroKill=" + numeroKill + ", numeroMortes=" + numeroMortes + ", numeroAssists=" + numeroAssists + ", KdRatio=" + KdRatio + '}';
    }

    public Integer getIdEstaticaparida() {
        return idEstaticaparida;
    }

    public void setIdEstaticaparida(Integer idEstaticaparida) {
        this.idEstaticaparida = idEstaticaparida;
    }

    public int getNumeroKill() {
        return numeroKill;
    }

    public void setNumeroKill(int numeroKill) {
        this.numeroKill = numeroKill;
    }

    public int getNumeroMortes() {
        return numeroMortes;
    }

    public void setNumeroMortes(int numeroMortes) {
        this.numeroMortes = numeroMortes;
    }

    public int getNumeroAssists() {
        return numeroAssists;
    }

    public void setNumeroAssists(int numeroAssists) {
        this.numeroAssists = numeroAssists;
    }

    public double getKdRatio() {
        return KdRatio;
    }

    public void setKdRatio(double KdRatio) {
        this.KdRatio = KdRatio;
    }
    
}
