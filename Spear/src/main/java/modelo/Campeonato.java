/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author jonin
 */
public class Campeonato extends Endereco{
    private Integer id;
    private String nome;
    private String descricao;
    private Formato formato;
    private Endereco endereco;
    private ArrayList<Time> times;
    private ArrayList<Partida> partidas;

    public Campeonato(Integer id, String nome, String descricao, Formato formato, Endereco endereco, ArrayList<Time> times, ArrayList<Partida> partidas, Integer idEndereco, String rua, String numero, int capacidade, String cidade, String estado, String pais) {
        super(idEndereco, rua, numero, capacidade, cidade, estado, pais);
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.formato = formato;
        this.endereco = endereco;
        this.times = times;
        this.partidas = partidas;
    }

 

    // getters e setters

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    // outros métodos

    public void addTime(Time time) {
        this.times.add(time);
    }

    public void addPartida(Partida partida) {
        this.partidas.add(partida);
    }

    // sobrescrita do método toString()

    @Override
    public String toString() {
        return "Campeonato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", formato=" + formato +
                ", endereco=" + endereco +
                ", times=" + times +
                ", partidas=" + partidas +
                '}';
    }
}
