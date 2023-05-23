/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author jonin
 */
public class Partida extends Campeonato{
    private Integer idPartida;
    private Time timeVencedor;
    private Time timePerdedor;
    private LocalDate data;
    private LocalTime horario;
    private String tempoPartida;
    private Campeonato camp;
    private String mvp;

    public Partida(Integer idPartida, Time timeVencedor, Time timePerdedor, LocalDate data, LocalTime horario, String tempoPartida, Campeonato camp, String mvp, Integer id, String nome, String descricao, Formato formato, Endereco endereco, ArrayList<Time> times, ArrayList<Partida> partidas, Integer idEndereco, String rua, String numero, int capacidade, String cidade, String estado, String pais) {
        super(id, nome, descricao, formato, endereco, times, partidas, idEndereco, rua, numero, capacidade, cidade, estado, pais);
        this.idPartida = idPartida;
        this.timeVencedor = timeVencedor;
        this.timePerdedor = timePerdedor;
        this.data = data;
        this.horario = horario;
        this.tempoPartida = tempoPartida;
        this.camp = camp;
        this.mvp = mvp;
    }
    public Partida(Integer id, String nome, String descricao, Formato formato, Endereco endereco, ArrayList<Time> times, ArrayList<Partida> partidas, Integer idEndereco, String rua, String numero, int capacidade, String cidade, String estado, String pais) {
        super(id, nome, descricao, formato, endereco, times, partidas, idEndereco, rua, numero, capacidade, cidade, estado, pais);
    }

    public Integer getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }

    public Time getTimeVencedor() {
        return timeVencedor;
    }

    public void setTimeVencedor(Time timeVencedor) {
        this.timeVencedor = timeVencedor;
    }

    public Time getTimePerdedor() {
        return timePerdedor;
    }

    public void setTimePerdedor(Time timePerdedor) {
        this.timePerdedor = timePerdedor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getTempoPartida() {
        return tempoPartida;
    }

    public void setTempoPartida(String tempoPartida) {
        this.tempoPartida = tempoPartida;
    }

    public Campeonato getCamp() {
        return camp;
    }

    public void setCamp(Campeonato camp) {
        this.camp = camp;
    }

    public String getMvp() {
        return mvp;
    }

    public void setMvp(String mvp) {
        this.mvp = mvp;
    }

    @Override
    public String toString() {
        return "Partida{" + "idPartida=" + idPartida + ", timeVencedor=" + timeVencedor + ", timePerdedor=" + timePerdedor + ", data=" + data + ", horario=" + horario + ", tempoPartida=" + tempoPartida + ", camp=" + camp + ", mvp=" + mvp + '}';
    }
    
}
